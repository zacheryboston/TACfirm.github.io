# Topic 2 Object Oriented Programming 

## Object Oriented Principles 
* [art](art): art
* [game](game): game
* [band](band): band
 
## Object Oriented Design and Collections
* [collection](collection): Java Collection Classes 
* [registrar](registrar): Class Design and Implementation, registrar example 

## Project 1
* [file](file): Streams, Paths, Files, Generics

# Compiling and Running Java code in src repository, and creating javadoc for <package_name>

### Windows
```
javac -cp -d bin .\src\<package_name>\*.java
java -cp .\bin\ <package_name>.<Class_w_main_method>
javadoc –d docs .\src\<package_name>\*.java
javadoc -d docs src/<package_name1>/*.java src/<package_name2>/*.java src/<package_name3>/*.java
```
### MacOS
```
javac -d bin ./src/<package_name>/*.java
java -cp ./bin/ <package_name>.<Class_w_main_method>
javadoc –d docs ./src/<package_name>*.java
```
### Linux
```
javac -d bin/ src/<package_name>/*.java
java –cp bin/ <package_name>.<Class_w_main_method>
javadoc –d docs src/<package_name>/*.java
```


 
