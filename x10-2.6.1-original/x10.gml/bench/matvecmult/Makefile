###################################################
# Source and target file
###################################################
target_list 	= MatVecMult MatVecMultCol SpMV

target		= MatVecMult

# build path
build_path	= build

# GML path
gml_path    = ../..

# compile options
X10_FLAG	= -d $(build_path) -report postcompile=2 -v -errors 5 -VERBOSE_CHECKS #-O -NO_CHECKS

# runtime settings
runtime_list = sock java
numplaces = 4
test_args = 

###################################################
# Executing
###################################################
default	: java
run		: run_java
###################################################

spmv_x10:	SpMV.x10
	x10c++ -O -NO_CHECKS -VERBOSE_CHECKS -g -x10lib $(base_dir_elem)/native_gml.properties -post '\# -O3' -report postcompile=1 SpMV.x10 -o spmv_x10

###################################################
# Including rules
###################################################
include $(gml_path)/scripts/build_common.mk
include $(gml_path)/scripts/build_managed.mk
include $(gml_path)/scripts/build_native.mk
include $(gml_path)/scripts/test_run.mk
