package level1.exercise4.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class TxtFileReader {

    public static void readAndPrintFile(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IllegalArgumentException("The file does not exist: " + filePath);
        }

        if (!file.isFile()) {
            throw new IllegalArgumentException("The path is not a file: " + filePath);
        }

        if (!file.canRead()) {
            throw new SecurityException("Cannot read the file: " + filePath);
        }

        if (!filePath.toLowerCase().endsWith(".txt")) {
            throw new IllegalArgumentException("Only .txt files are supported.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contents of file: " + file.getName() + "\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + e.getMessage());
        }
    }
}

