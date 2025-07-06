package level1.exercise1.utils;

import java.io.File;
import java.util.Arrays;

public class SortFilesFromDirectory {

    public static void sortFiles(File loadedDirectory) {

        String[] filesList = loadedDirectory.list();

        if (filesList == null) {
            throw new IllegalStateException("No es pot llegir el contingut del directori.");
        }

        if (filesList.length == 0) {
            System.out.println("El directori està buit.");
            return;
        }

        Arrays.sort(filesList);

        for (String file : filesList) {
            System.out.println(file);
        }

    }
}
