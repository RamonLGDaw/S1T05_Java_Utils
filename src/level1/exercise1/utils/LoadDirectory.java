package level1.exercise1.utils;

import java.io.File;

public class LoadDirectory {

    public static File loadDirectory(String path) {

        if (path == null || path.trim().isEmpty()) {
            throw new IllegalArgumentException("S'ha d'introduïr una ruta no buida.");
        }

        File loadedDirectory = new File(path);

        if (!loadedDirectory.isDirectory()) {
            throw new IllegalArgumentException("S'ha d'introduïr una ruta correcte d'un directori. ");
        }

        if (!loadedDirectory.canRead()) {
            throw new SecurityException("No es pot llegir el directori: " + loadedDirectory.getAbsolutePath());
        }
        return loadedDirectory;

    }

}
