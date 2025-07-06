package level1.exercise2.utils;

import java.io.File;
import java.util.Arrays;

public class DirectorySorter {

    public static File[] sortDirectory(File loadedDirectory) {

        File[] directoryList = loadedDirectory.listFiles();

        if (directoryList == null) {
            throw new IllegalStateException("No es pot llegir el contingut del directori.");
        }

        Arrays.sort(directoryList);

        return directoryList;

    }
}
