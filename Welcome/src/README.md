# STEP 1: Compiling and Running Java code

```
javac -d classes/ src/Welcome.java 
java -cp classes Welcome
javadoc src/Welcome.java -d docs/
```

# STEP 2: Compiling and Running Java code in a package
We assume the following folders exist locally at the same level (not provided)
* :scroll: docs - folder to contain all javadoc files
* :dash: classes - folder to contain all .class files (not provided)

```
javac -d classes first/*.java
java -cp classes first.GreeterTester
javadoc -d docs first/*
```

# STEP 3: Compiling and Running Java code in a multi-level package
We assume the following folders exist locally at the same level (not provided)
* :scroll: docs - folder to contain all javadoc files
* :dash: classes - folder to contain all .class files (not provided)

```
javac -d classes src/tacos/tacoSpecial/*.java src/tacos/tacoDaily/*.java
java -cp classes tacoDaily.TacoMain
java -cp classes tacoSpecial.TacoMain
javadoc -d docs src/tacos/tacoSpecial/*.java src/tacos/tacoDaily/*.java
```