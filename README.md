# uClocks
This project gives the implementation of uClock, an extension to X10 clocks for improved efficiency, in the X10-2.6.1 language. Additional details are provided in the Artifact Description Appendix of the paper.

## Hardware dependencies
An active internet connection is required to download the necessary jar files and a multi-core system with at least 16 cores.

## Software dependencies
The dependencies are given on the X10 website (http://x10-lang.org/x10-development/building-x10-from-source.html)

## Datasets
We use the IMSuite benchmarks for simulating distributed algorithms, which are available at https://www.cse.iitm.ac.in/ ~krishna/imsuite/. We use all the eleven Iterative FAC (Finish-Async-Clocks) Kernels for X10-2.5.0.
The input size used is 512 for all kernels except the byzantine and dominatingSet kernels which use an input size of 128.
This repository includes a copy of all the required datasets for running the experiments.

## Installation
Run the following two commands to quickly build the two versions of X10 (the first being the original X10 language+runtime, and the second being the X10 language+runtime extended with uClocks)
```
$ cd uClocks
$ sh compile-X10Clocks.sh
$ sh compile-uClocks.sh
```

## Experiment workflow
#### Run benchmarks with original X10 clocks
Run the following command to get the readings of the IMSuite benchmarks (IMSuite-IterativeKernels) on the uClocks extended runtime, in the file ’originaloutput.txt’.
```
 $ python run-X10Clocks-on-IMSuite-kernels.py [numberOfCores] [numberOfRunsPerBenchmark] > originaloutput.txt
```
In case the benchmarks run into Out of Memory or Out of Heap space errors, run the following command instead, which uses smaller sized benchmarks, but will not give the same quality of results (recommended that you run on a more powerful system, instead of using this).
```
$ python run-X10Clocks-on-IMSuite-kernels_small-Inputs.py [numberOfCores] [numberOfRunsPerBenchmark] > originaloutput.txt
```
#### Run benchmarks with uClocks extended runtime
Run the following command to get the readings of the IMSuite benchmarks (IMSuite-IterativeKernels) on the uClocks extended runtime, in the file ’uClocksoutput.txt’.
```
$ python run-uClocks-on-IMSuite-kernels.py [numberOfCores] [numberOfRunsPerBenchmark] > uClocksoutput.txt
```
In case the benchmarks run into Out of Memory or Out of Heap space errors, run the following command instead, which uses smaller sized benchmarks, but will not give the same quality of results (recommended that you run on a more powerful system, instead of using this).
```
$ python run-uClocks-on-IMSuite-kernels_small-Inputs.py [numberOfCores] [numberOfRunsPerBenchmark] > uClocksoutput.txt
```

## Notes
For any further issues or queries in the installation, kindly refer the X10 website http://x10-lang.org/x10-development/building-x10-from-source.html, the SourceForge page https://sourceforge.net/p/x10/mailman/x10-users/ or the Stack overflow page https://stackoverflow.com/questions/tagged/x10-language.
