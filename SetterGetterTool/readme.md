# Tool to generate setter getter and default constructor for class

▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

 ## 👉How to compile :-

1) src\util folder contains source code for SetterGetterGenerator.java
2) dist folder contains tmlist.jar file
   ♣To create class file of SetterGetterGenerator.java
3) In command prompt 'C:\SetterGetterTool\src>javac -d ..\classes -classpath ..\dist\*;. util\*.java' 

    ### ♣To create jar file from class file
4) After class file created, now creating jar files from class files
   cmd 'C:\SetterGetterTool\classes>jar -cvf ..\dist\common.jar util' 
   
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

##   ♦♦♦  Usage : ♦♦♦ 
	
 ### 👉To generate setter/getter and default constructor
1. 'c:\  \test>java -classpath path_to_jar_file;. util.SetterGetterGenerator class_name'
        or
2. 'c:\  \test>java -classpath path_to_classes;. util.SetterGetterGenerator class_name'
        or
3. 'java -classpath path_to_jar_file;. util.SetterGetterGenerator class_name constructor=false/true'

• 1. and • 2. cmd will generate setter/getter and default constructor.

• 3. cmd will generate setter/getter and as per requirement (true/false) generates constructor

▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

