# Project: Level 1 - Exercise 2

## Description
This program recursively lists the contents of a given directory (received as a command-line argument) in alphabetical order, including all subdirectories and their contents.

## Requirements
- Compile and run from the command line
- Use relative paths only
- Show file type (Directory/File) and last modified date
- Handle errors for missing or invalid paths

## Java Version
Tested with **Java JDK 17**.

## Compilation
From the project root (where `src/` and `bin/` folders are located), run:

```bash
javac -d bin src/level1/exercise2/Main.java src/level1/exercise2/utils/*.java src/level1/exercise1/utils/LoadDirectory.java

```

This compiles the Java source files and outputs the compiled `.class` files into the `bin/` folder.

## Execution
To run the program, use the following command:

```bash
java -cp bin level1.exercise2.Main <relative_directory_path>
```


### Example
```bash
java -cp bin level1.exercise2.Main test-dir-Ex2
```

## Output
For each file or folder, the program prints:
- Its name
- Whether it is a directory (`D`) or a file (`F`)
- Its last modified date (format: `dd/MM/yyyy HH:mm:ss`)
- Recursively prints subdirectories

## Notes
- The directory must exist and be readable.
- If the path is empty, invalid, or points to a file, an error message will be shown.
- Empty directories are reported as such.