package level1.exercise2.utils;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirectoryPrinter {


    public static void showInTerminal(File[] directoryList) {
        for (int i = 0; i < directoryList.length; i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            File directoryElement = directoryList[i];
            System.out.println(
                    directoryElement.getName() + " - (" +
                            (directoryElement.isDirectory() ? "D" : "F") + ") - " +
                            "Last modified: " + simpleDateFormat.format(directoryElement.lastModified())
            );

            if (directoryElement.isDirectory()) {
                File[] subDirectoryList = DirectorySorter.sortDirectory(directoryElement);
                showInTerminal(subDirectoryList);
            }
        }
    }
}
