package level1.exercise3.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTxtFile {


    public static BufferedWriter createWriter(String pathOutput) throws IOException {
        File file = new File(pathOutput);
        File parentDir = file.getParentFile();

        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
        }

        return new BufferedWriter(new FileWriter(file, true));
    }


    public static void writeLine(BufferedWriter writer, String line) throws IOException {
        writer.write(line);
        writer.newLine();
    }

    public static void closeWriter(BufferedWriter writer) {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing writer: " + e.getMessage());
        }
    }
}