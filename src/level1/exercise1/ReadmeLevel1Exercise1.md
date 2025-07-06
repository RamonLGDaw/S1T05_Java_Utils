# Project: Level 1 - Exercise 1

## Description
This program lists the contents of a given directory (received as a command-line argument) in alphabetical order.

## Requirements
- Compile and run from the command line
- Use relative paths only

## Java Version
Tested with **Java JDK 17**.

## Compilation
From the project root (where `src/` and `bin/` folders are located), run:

```bash
javac -d bin src/level1/exercise1/Main.java src/level1/exercise1/utils/*.java
```

This compiles the Java source files and outputs the compiled `.class` files into the `bin/` folder.

## Execution
To run the program, use the following command:

```bash
java -cp bin level1.exercise1.Main <relative_directory_path>
```

### Example
```bash
java -cp bin level1.exercise1.Main test-dir-Ex1
```

## Notes
- The directory must exist and be readable.
- The program prints the contents of the directory in alphabetical order.
- If no path is provided, an error message will be shown.