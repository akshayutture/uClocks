/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2014.
 *  (C) Copyright Australian National University 2009-2010.
 */

import harness.x10Test;
import x10.util.*;

/**
 * Test operator redefinition.
 * @author mandel
 */

class For1 extends x10Test {
    static class Parallel {
	public static operator for(interval: Iterable[Long], body: (Long)=>void) {
	    finish for(i in interval) async {
		    body(i);
		}
	}
    }

    public def run() : boolean {
	val x = new Cell[Long](0);
	Parallel.for (i: Long in 1 .. 10) {
	    atomic { x() = x() + i; }
	}
	return 55 == x();
    }

    public static def main(Rail[String]) {
        new For1().execute();
    }

}
