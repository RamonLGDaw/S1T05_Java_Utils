# Project: Level 1 - Exercise 3

## Description
This program recursively lists the contents of a given directory and writes the result to a text file instead of printing to the console.

It includes:
- Alphabetical sorting
- Recursive traversal of subdirectories
- Type identification: Directory (`D`) or File (`F`)
- Last modified date for each entry

## Requirements
- Must compile and run from the command line
- Use **relative paths** (no hardcoded absolute paths)
- Compatible with Windows, macOS, and Linux
- Use `File.separator` for portability
- Output is written to a `.txt` file (not printed)
- Handle errors for invalid paths

## Java Version
Tested with **Java JDK 17**

## Folder Structure

```
S1T5_java_utils/
├── bin/                          # Compiled class files
├── src/                          # Java source code
│   └── level1/
│       ├── exercise1/
│       ├── exercise2/
│       └── exercise3/
│           └── utils/
├── test-dir-Ex2/                 # Example test directory
├── README.md
```

## Compilation

From the root of the project, run:

```bash
javac -d bin src/level1/exercise3/Main.java src/level1/exercise1/utils/LoadDirectory.java src/level1/exercise2/utils/DirectorySorter.java src/level1/exercise3/utils/*.java
```

This compiles all necessary Java source files and places the `.class` files into the `bin/` folder.

## Execution

You can run the program with or without arguments.

### Option 1: Run with arguments

```bash
java -cp bin level1.exercise3.Main <input_directory_path> <output_file_path>
```

#### Example:
```bash
java -cp bin level1.exercise3.Main test-dir-Ex2 output.txt
```

- The program will write the directory structure of `test-dir-Ex2` into `output.txt`.

> 💡 If your path contains spaces, wrap it in quotes:
> `java -cp bin level1.exercise3.Main "C:\Users\User\My Folder" "output file.txt"`

### ⚠️ Important: Output file must end with `.txt`

Make sure the output file path **ends in `.txt`**, or the system might not recognize it as a text file.

If you run:
```bash
java -cp bin level1.exercise3.Main test-dir-Ex2 output
```

It will still create a file named `output`, but it won't be treated as a text file (e.g., you can't open it easily on double-click in some systems, and it might be ignored in Exercise 4).

✅ Correct usage:
```bash
java -cp bin level1.exercise3.Main test-dir-Ex2 output.txt
```

### Option 2: Run with no arguments

If no arguments are provided, the program will use the following defaults:
- **Input directory**: `test-dir-Ex2`
- **Output file**: `src/level1/exercise3/FitxerCreatExercici3.txt`

```bash
java -cp bin level1.exercise3.Main
```

## Output Format

Each entry written to the output file includes:
- Name of the file or folder
- Whether it is a directory (`D`) or a file (`F`)
- Last modified date (format: `dd/MM/yyyy HH:mm:ss`)
- Subdirectories are traversed recursively

### Example output:
```
documents - D - Last modified: 03/07/2025 12:32:11
notes.txt - F - Last modified: 01/07/2025 18:44:02
images - D - Last modified: 30/06/2025 09:14:22
```

## Error Handling
- If the input path does not exist or is not a directory, an error is shown.
- If the directory is empty, a message is printed.
- File writing errors are handled gracefully with messages.

## Notes
- The output file is created automatically if it does not exist.
- Content is **appended** to the file if it already exists.
- This program uses `File.separator` to ensure portability across systems (Linux, macOS, Windows).
