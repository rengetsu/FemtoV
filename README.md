# FemtoV
Femto V FemtoScope for Pulse Pattern Generator. 

This is a program designed to work with the device "FemtoScope" (9511 and 9512 models). "FemtoScope" - is a pulse pattern generator (1,2 GHz). 

Software created and developed by "Eltesta".
For more information about devices and projects, visit website: https://eltesta.com/.

## More About
A pulse generator is either an electronic circuit or a piece of electronic test equipment used to generate rectangular pulses. A pulse generator is of purpose to generate electrical pulse of different shapes.

This software used to generate digital electronics stimuli. Designed and built to set up and work with a generator.

## Requirements

  * Git
  * Ant 1.9.9 or above
  * JDK 8 or 11 (to build NetBeans)
  * JDK 9 or above (to run NetBeans)
  * MinGW (optional), to build Windows Launchers
  
## Setup

Building this project requires that Ivy be available to Ant.

All you need is ivy.jar in Ant's classpath (in your `$CLASSPATH`,
`$ANT_HOME/lib`, or `~/.ant/lib`).

 To install run the following commands in a working directory:
 ```
 git clone https://github.com/rengetsu/FemtoV.git
 ```
## Preview Screenshot

![GitHub Logo](https://i.ibb.co/09KqqkM/Preview-0-75.png)

## Important note
This is a project that contains only that part of the code that is responsible for managing the graphical user interface!

All the code responsible for working with the hardware program is removed here!
