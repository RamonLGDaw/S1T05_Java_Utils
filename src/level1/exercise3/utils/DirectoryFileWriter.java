package level1.exercise3.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static level1.exercise2.utils.DirectorySorter.sortDirectory;

public class DirectoryFileWriter {


    public static void writeDirectoryTreeToFile(File[] directoryList, String pathOutput) {
        try {

            BufferedWriter writer = OutputTxtFile.createWriter(pathOutput);
            writeDirectoryTree(directoryList, writer);
            OutputTxtFile.closeWriter(writer);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }


    private static void writeDirectoryTree(File[] directoryList, BufferedWriter writer) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : directoryList) {
            String line;

            if (file.isDirectory()) {
                line = file.getName() + " - D - Last modified: " + sdf.format(file.lastModified());
                OutputTxtFile.writeLine(writer, line);
                File[] subList = sortDirectory(file);
                writeDirectoryTree(subList, writer);
            } else if (file.isFile()) {
                line = file.getName() + " - F - Last modified: " + sdf.format(file.lastModified());
                OutputTxtFile.writeLine(writer, line);
            }
        }
    }
}