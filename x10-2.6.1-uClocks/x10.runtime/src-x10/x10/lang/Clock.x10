/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2016.
 */

package x10.lang;

import x10.compiler.Global;
import x10.compiler.Native;
import x10.compiler.Pinned;

import x10.io.Deserializer;
import x10.io.Serializer;
import x10.util.Map;
import x10.util.HashMap;
import x10.util.concurrent.Monitor;

import x10.xrx.Runtime;

/**
 * Ported from 2.0 to 2.1 via naive simulation of 
 *       2.0 style global object by injecting a root field
 *       that is a GlobalRef(this) and always accessing fields 
 *       as this.root().f instead of this.f.
 * TODO: Port to Dual Class implementation of global objects.
 */
public final class Clock(name:String) {
    private val root = GlobalRef[Clock](this);
    public def equals(a:Any) {
        if (a == null || ! (a instanceof Clock)) {
            return false;
        }
        return (a as Clock).root == this.root;
    }
    public def hashCode() = root.hashCode();
    
    public static def make(): Clock = make("");
    public static def make(name:String):Clock {
        if (Runtime.STATIC_THREADS) throw new ClockUseException("Clocks are not compatible with static threads.");
        val clock = new Clock(name);
        getClockPhases().put(clock, FIRST_PHASE);
        return clock;
    }

    public static FIRST_PHASE = 1n;
    // NOTE: all transient fields must always be accessed as this.root().f (and at place this.root.home), 
    // not this.f
    private transient var count:Int = 1n;
    private transient var alive:Int = 1n;
    private transient var phase:Int = FIRST_PHASE;

    public transient var clockMonitor:Monitor;
    
    private def this(name:String) {
        property(name);
        clockMonitor = new Monitor();
    }

    // should be accessed through root()
    @Pinned private def resumeLocal()  {
    	clockMonitor.lock(); //Lock access to the clock (replaces the previous implementation using atomics)
        if (--alive == 0n) {
            alive = count;
            ++phase;
            clockMonitor.release2(); //Use release here because apart from unlocking, we also want to unpark all threads that got parked in the advanceUnsafe() function 
            return;
        }
        clockMonitor.unlock(); //This statement replaces the closing brace of the atomic in the previous implementation
    }
    @Pinned private def resumeLocalEager()  {
    	clockMonitor.lock(); //Lock access to the clock (replaces the previous implementation using atomics)
        if (--alive == 0n) {
            alive = count;
            ++phase;
        }
        clockMonitor.release2(); //Use release here because apart from unlocking, we also want to unpark all threads that got parked in the advanceUnsafe() function 
    }
    // should be accessed through root()
    @Pinned private def dropLocal(ph:Int) {
    	clockMonitor.lock(); //Lock access to the clock (replaces the previous implementation using atomics)
        --count;
        if (-ph != phase) {
            if (--alive == 0n) {
                alive = count;
                ++phase;
                clockMonitor.release2(); //Use release here because apart from unlocking, we also want to unpark all threads that got parked in the advanceUnsafe() function 
                return;
            }
        }
        clockMonitor.unlock(); //This statement replaces the closing brace of the atomic in the previous implementation
    }

    @Global private def get() = getClockPhases().get(this);
    @Global private def put(ph:Int) = getClockPhases().put(this, ph);
    @Global private def remove() = getClockPhases().remove(this);
    @Global def register() {
        if (dropped()) clockUseException("async clocked");
        val ph = get();
        at (root) {
            val me = root();
            me.clockMonitor.lock(); //Lock access to the clock (replaces the previous implementation using atomics)
            ++ me.count;
            if (-ph != me.phase){
                ++ me.alive;
            }
            me.clockMonitor.unlock(); //This statement replaces the closing brace of the atomic in the previous implementation
        }   
        return ph;
     }
     @Global def resumeUnsafe() {
        Runtime.ensureNotInAtomic();
        val ph = get();
        if (ph < 0) return;
        at (root) {
            val me = root();
            me.resumeLocal();
        }
        put(-ph);
    }
    @Global def resumeUnsafeEager() {
        Runtime.ensureNotInAtomic();
        val ph = get();
        if (ph < 0) return;
        at (root) {
            val me = root();
            me.resumeLocalEager();
        }
        put(-ph);
    }
    @Global def advanceUnsafe() {
        Runtime.ensureNotInAtomic();
        val ph = get();
        val abs = Math.abs(ph);
        at (root) {
            val me = root();
            if (ph > 0) me.resumeLocal();
            //The next 4 lines replaces the statement 'when (abs < me.phase);' in the previous implementation
            me.clockMonitor.lock();
            while (abs >= me.phase){
            	me.clockMonitor.await2();
            }
            me.clockMonitor.unlock();
        }
        put(abs + 1n);
    }
    @Global def advanceUnsafeEager() {
        Runtime.ensureNotInAtomic();
        val ph = get();
        val abs = Math.abs(ph);
        at (root) {
            val me = root();
            if (ph > 0) me.resumeLocalEager();
            //The next 4 lines replaces the statement 'when (abs < me.phase);' in the previous implementation
            me.clockMonitor.lock();
            while (abs >= me.phase){
            	me.clockMonitor.await2();
            }
            me.clockMonitor.unlock();
        }
        put(abs + 1n);
    }
    @Global def dropUnsafe() {
        val ph = remove();
        at(root) {
            val me = root();
            me.dropLocal(ph);
        }
    }
    @Global def dropInternal() {
        val ph = get();
        at(root) {
            val me = root();
            me.dropLocal(ph);
        }
    }
    public @Global def registered():Boolean = getClockPhases().containsKey(this);
    public @Global def dropped():Boolean = !registered();
    public @Global def phase():Int {
        if (dropped()) clockUseException("phase");
        return Math.abs(get());
    }
    public @Global def resume():void {
        if (dropped()) clockUseException("resume");
        resumeUnsafe();
    }
    public @Global def resumeLazy():void {
        if (dropped()) clockUseException("resume");
        resumeUnsafe();
    }
    public @Global def resumeEager():void {
        if (dropped()) clockUseException("resume");
        resumeUnsafeEager();
    }
    public @Global def advance():void {
        if (dropped()) clockUseException("advance");
        advanceUnsafe();
    }
    public @Global def advanceLazy():void {
        if (dropped()) clockUseException("advance");
        advanceUnsafe();
    }
    public @Global def advanceEager():void {
        if (dropped()) clockUseException("advance");
        advanceUnsafeEager();
    }
    public @Global def drop():void {
        if (dropped()) clockUseException("drop");
        dropUnsafe();
    }

    public def toString():String = name.equals("") ? System.identityToString(this) : name;
    
    private def clockUseException(method:String) {
        if (dropped()) throw new ClockUseException("invalid invocation of " + method + "() on clock " + toString() + "; calling activity is not clocked on this clock");
    }

    @Native("cuda", "__syncthreads()")
    public static def advanceAll():void {
        Runtime.ensureNotInAtomic();
        getClockPhases().advanceAll();
    }

    @Native("cuda", "__syncthreads()")
    public static def advanceAllLazy():void {
        Runtime.ensureNotInAtomic();
        getClockPhases().advanceAll();
    }
    
    @Native("cuda", "__syncthreads()")
    public static def advanceAllEager():void {
        Runtime.ensureNotInAtomic();
        getClockPhases().advanceAllEager();
    }
    
    public static def resumeAll():void { getClockPhases().resumeAll(); }
    
    public static def resumeAllLazy():void { getClockPhases().resumeAll(); }
    
    public static def resumeAllEager():void { getClockPhases().resumeAllEager(); }
    
    @Native("c++", "::x10::xrx::Runtime::activity()->clockPhases()")
    @Native("java", "x10.xrx.Runtime.activity().clockPhases()")
    private static native def getClockPhases():ClockPhases;

    /**
     * Specialization of HashMap to maintain the set of Clocks that
     * an Activity is currently registered on.
     * This type is public and many of its methods are public so it can be 
     * manipulated from the XRX runtime, but there is intentionally no accessible 
     * API that allows user-code to actually get the active instance 
     * of a ClockPhase for an Activity
     */
    public static class ClockPhases extends HashMap[Clock,Int] {
        // compute spawnee clock phases from spawner clock phases in async clocked(clocks)
        // and register spawnee on these on clocks
        public static def make(clocks:Rail[Clock]) {
            val clockPhases = new ClockPhases();
            for(var i:Long = 0; i < clocks.size; i++) 
                clockPhases.put(clocks(i), clocks(i).register());
            return clockPhases;
        }

        public static def make() = new ClockPhases();

        // next statement
        public def advanceAll() {
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().resumeUnsafe();
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().advanceUnsafe();
        }

        public def advanceAllEager() {
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().resumeUnsafeEager();
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().advanceUnsafeEager();
        }
        
        // resume all clocks
        public def resumeAll() {
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().resumeUnsafe();
        }

        // resume all clocks
        public def resumeAllEager() {
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().resumeUnsafeEager();
        }
        // drop all clocks
        public def drop() {
            for(entry:Map.Entry[Clock,Int] in entries()) entry.getKey().dropInternal();
            clear();
        }

        // HashMap implements CustomSerialization, so we must as well
        public def serialize(s:Serializer) {
            super.serialize(s);
        }
        def this() { super(); }
        def this(ds:Deserializer) { 
            super(ds); 
        }
    }
}

// vim:shiftwidth=4:tabstop=4:expandtab
