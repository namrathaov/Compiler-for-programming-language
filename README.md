### SER502-Spring2018-Team1

### Team Members:
		Namratha Olety Venkatesh
		Rachana Nagaraj Kashyap
		Rhythm Sharma
		Shreyas Hosahalli Govindaraja

System on which your compiler and runtime are built: Windows


Tools used

> For lexical analysis and parsing: Antlr  
> For intermediate code file generation: Antlr, Java  
> Compiler: Java JDK 1.8
> Runtime environment: Java JRE 1.8  


Directions to install the language

> Java Runtime 1.8 is required to run ESCN.
    

Directions to run the language

> To run the ESCN language, .escn file is required as the input. First command written below will generate .icf file which will be input to the runtime. On executing runtime, output will be displayed on console.


> The command to generate intermediate code file: java -jar EscnIcfGeneration.jar <filename.escn>
> The command to run the intermediate code file:  java -jar EscnRuntime.jar <filename.icf>
