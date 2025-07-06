package level1.exercise2.utils;

import level1.exercise1.utils.LoadDirectory;

import java.io.File;

public class DirectoryTree {

    public static void enterDirectory(String path) {

        File loadedDirectory = LoadDirectory.loadDirectory(path);
        File[] directoryList = DirectorySorter.sortDirectory(loadedDirectory);

        if (directoryList.length == 0) {
            System.out.println("El directori està buit.");
            return;
        }

        DirectoryPrinter.showInTerminal(directoryList);

    }
}
