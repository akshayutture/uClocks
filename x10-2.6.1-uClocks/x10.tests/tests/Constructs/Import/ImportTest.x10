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

import harness.x10Test;

/**
 * Minimal package and import test
 * @author kemal
 * 1/2005
 */
public class ImportTest extends x10Test {

	public def run(): boolean {
		return _T2.m2(49n);
	}

	public static def main(var args: Rail[String]): void {
		new ImportTest().execute();
	}
}
