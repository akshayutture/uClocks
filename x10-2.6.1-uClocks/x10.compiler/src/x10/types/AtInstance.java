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

package x10.types;

import polyglot.types.ClassType;
import polyglot.types.CodeInstance;
import polyglot.types.Flags;
import polyglot.types.Ref;
import polyglot.types.ContainerType;
import polyglot.types.Type;

/**
 * Represents an at.<br>
 * You'd think it wouldn't be necessary to have a representation of (nameless) ats in the
 * type system outside of <code>ClosureTypes</code>, but the control-/data-flow framework requires
 * that all code bodies have an associated instance. See <code>CodeNode.codeInstance()</code>, and
 * <code>Closure.enterScope()</code>, which needs to push something on the Context stack, but the
 * only reasonable thing to push is some form of <code>CodeInstance</code>. Perhaps there should be
 * a more general kind of "code context" class, with a corresponding push method on
 * <code>Context</code>.
 * @author rfuhrer
 */
public interface AtInstance extends MethodInstance {
    AtDef def();
    CodeInstance<?> methodContainer();
    ClassType typeContainer();
    AtInstance flags(Flags f);
    ClassType container();
    AtInstance container(ContainerType t);
}
