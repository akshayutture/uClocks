#!/usr/bin/env python
import subprocess 
import sys

tasksetArgument = sys.argv[1]
numberOfRuns = int(sys.argv[2])
inputsFolder = 'IMSuite-InputFiles'
iterativeKernelsFolder = 'IMSuite-IterativeKernels'
x10CompilerLocation = "../../x10-2.6.1-original/x10.dist/bin/x10c"
x10RuntimeLocation = "../../x10-2.6.1-original/x10.dist/bin/x10"
compileSource = True

'''
COMPILE THE IMSUITE SOURCE FILES
'''

if compileSource:
	#Compile the Iterative Kernels
	inputFolders = subprocess.Popen(['ls', iterativeKernelsFolder], stdout=subprocess.PIPE)
	#For every one of those sub folders
	for folderName in inputFolders.stdout.readlines():
		folderName = folderName[:-1]  #Remove the '\n' from the folder name
		#Construct the change directory and compilation command
		cdCommand = "cd " + iterativeKernelsFolder + "/" + folderName
		x10cCompilationCommand = x10CompilerLocation + " " + folderName + ".x10"
		combinedCommand = cdCommand + " && " + x10cCompilationCommand
		#Run the combined 'cd' followed by 'x10c' on this folder
		subprocess.call(combinedCommand, shell=True)
	

'''
RUN EACH INPUT FILE WITH THE CORRECT PROGRAM FOR THE ITERATIVE KERNELS
'''
subprocess.call('printf "\n\nITERATIVE KERNELS\n\n"' , shell=True)

#Get the list of all the subfolders in the inputsFolder
inputFolders = subprocess.Popen(['ls', inputsFolder], stdout=subprocess.PIPE)

#For every one of those sub folders
for folderName in inputFolders.stdout.readlines():
	folderName = folderName[:-1]  #Remove the '\n' from the folder name
	#Get the list of input files in that folder
	inputFiles = subprocess.Popen(['ls', (inputsFolder + '/' + folderName)], stdout=subprocess.PIPE)
	#Loop through all the files
	for fileName in inputFiles.stdout.readlines():
		fileName = fileName[:-1]  #Remove the '\n' from the file name
		
		#Compute the reducedFileName - which is just the initial part of the file - this is the name expected by the .x10 source files
		splitFileName = fileName.split('_')
		reducedFileName = splitFileName[0]
		for x in splitFileName[1:]:
			if x[0].isdigit():
				break
			else:
				reducedFileName = reducedFileName + "_" + x
		#Correct .class file name to run this input file with
		correctClassFileName = reducedFileName[5:]
		
		#Write out the copy command - copy the input file to the correct directory
		copySource = inputsFolder + '/' + folderName + '/' + fileName
		copyDestination = iterativeKernelsFolder + "/" + correctClassFileName + "/" + reducedFileName + ".txt"
		copyCommand = "cp " + copySource + " " + copyDestination
		#Run the  the copy command
		subprocess.call(copyCommand , shell=True)
		
		#Construct the echo command, change directory command and compilation command
		echoCommand = "echo " + fileName
		cdCommand = "cd " + iterativeKernelsFolder + "/" + correctClassFileName
		#x10Command = "x10 " + correctClassFileName
		x10Command = " && taskset -c 0-" + str(int(tasksetArgument)-1) + " " + x10RuntimeLocation + " " + correctClassFileName
		x10Command = x10Command * numberOfRuns
		combinedCommand = echoCommand + " && " + cdCommand + x10Command

		
		#Run the combined 'echo' followed by 'cd' followed by 'x10' on this folder
		subprocess.call(combinedCommand , shell=True)

