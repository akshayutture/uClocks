#
#  This file is part of the X10 project (http://x10-lang.org).
#
#  This file is licensed to You under the Eclipse Public License (EPL);
#  You may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#      http://www.opensource.org/licenses/eclipse-1.0.php
#
#  (C) Copyright IBM Corporation 2006-2016.
#

## This makefile is used to 
## 1) launch benchmark testsuite for evaluating scalability
## 2) parsing output log

##-----------------------------------

##-----------------------------------
SHELL=bash
MAKE =make

##-----------------------------------
run_test     = ./ptest_place.pl
result_dat   = result_place.dat

##-----------------------------------
default: help

##-----------------------------------
run		:
	$(run_test) -r

parse 	:
	$(run_test) -p | tee $(result_dat)

##-------------------

help    ::
	@echo "";
	@echo "====== Help: SUMMA dense matrix multiplication tests on topology size ===========";
	@echo "make run        : launch benchmark test suite";
	@echo "make parse      : parse output log of tests and write data to $(result_dat)";
	@echo "";
