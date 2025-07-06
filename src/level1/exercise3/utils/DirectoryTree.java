package level1.exercise3.utils;

import level1.exercise1.utils.LoadDirectory;
import level1.exercise2.utils.DirectorySorter;

import java.io.File;


public class DirectoryTree {

    public static void enterDirectory(String pathInput, String pathOutput) {

        File loadedDirectory = LoadDirectory.loadDirectory(pathInput);
        File[] directoryList = DirectorySorter.sortDirectory(loadedDirectory);

        if (directoryList.length == 0) {
            System.out.println("El directori està buit.");
            return;
        }

        DirectoryFileWriter.writeDirectoryTreeToFile (directoryList, pathOutput);

    }
}
