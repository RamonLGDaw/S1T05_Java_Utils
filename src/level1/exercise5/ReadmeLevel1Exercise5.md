# Level 1 - Exercise 5

## Description
This Java program creates an object of type `Book`, serializes it to a `.ser` file, and then deserializes it to recover the object. If successful, the recovered object is printed to the console.

The objective is to understand the process of object serialization and deserialization in Java.

---

## Requirements

- Must be compiled and executed from the command line.
- Use **relative paths** and `File.separator` for portability.
- Compatible with **Windows**, **macOS**, and **Linux**.
- The `.ser` file is automatically created if it doesn't exist.
- Java version must be **17** or higher.
- No comments should be included in the code (as required by delivery standards).

---

## Project Structure

```
S1T5_java_utils/
├── bin/                                 # Compiled .class files
├── src/
│   └── level1/
│       └── exercise5/
│           ├── Main.java
│           ├── Book.ser                 # Created when the program runs
│           ├── utils/
│           │   └── ObjectSerializer.java
│           └── model/
│               └── Book.java
└── README.md (this file)
```

---

## Compilation

From the root of the project, run:

```bash
javac -d bin src/level1/exercise5/Main.java src/level1/exercise5/model/Book.java src/level1/exercise5/utils/ObjectSerializer.java
```

This compiles the `.java` files and places the `.class` files inside the `bin/` directory.

---

## Execution

Once compiled, run:

```bash
java -cp bin level1.exercise5.Main
```

The program:

1. Creates a `Book` object
2. Serializes it to `Book.ser`
3. Deserializes it from the file
4. Prints the result to the console

---

## Example Output

```
Object serialized to: src/level1/exercise5/Book.ser
Object deserialized from: src/level1/exercise5/Book.ser
Recovered object: Llibre: Clean Code escrit per Robert C. Martin (2008)
```

---

## Notes

- The `.ser` file contains the binary stream of the serialized object.
- `try-with-resources` is used to automatically close streams.
- Exceptions `IOException` and `ClassNotFoundException` are properly handled.
- `instanceof` is used to verify the type of the deserialized object.