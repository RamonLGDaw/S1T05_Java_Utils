# Project: Level 1 - Exercise 4

## Description
This program reads the contents of a `.txt` file and prints it to the console.

It validates that:
- The file exists
- It is a regular file (not a directory)
- It has read permissions
- It has a `.txt` extension

If any of these conditions are not met, the program fails immediately (fail-fast).

## Requirements
- Must compile and run from the command line
- Use **relative paths**
- Compatible with Windows, macOS, and Linux
- Handle common file errors clearly
- Follow fail-fast principles

## Java Version
Tested with **Java JDK 17**

## Folder Structure

```
src/
└── level1/
    └── exercise4/
        ├── Main.java
        ├── ReadmeLevel1Exercise4.md
        ├── TestFileExercise4.txt
        └── utils/
            └── TxtFileReader.java
```

## Compilation

From the root of the project, run:

```bash
javac -d bin src/level1/exercise4/Main.java src/level1/exercise4/utils/TxtFileReader.java
```

This compiles the source files into the `bin/` directory.

## Execution

### Option 1: Run with file path argument

```bash
java -cp bin level1.exercise4.Main <file_path>
```

#### Example:
```bash
java -cp bin level1.exercise4.Main src/level1/exercise3/FitxerCreatExercici3.txt
```

### Option 2: Run without arguments

If no file path is given, the program uses a default:

```bash
java -cp bin level1.exercise4.Main
```

It will try to open:

```
src/level1/exercise4/TestFileExercise4.txt
```

## Output

The program prints the contents of the specified `.txt` file line by line.

## Error Handling

If the file is invalid or unreadable, a clear error message is printed, and execution stops immediately.

## Notes

- File extension must be `.txt`
- File must be accessible and readable