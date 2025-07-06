package level1.exercise1.utils;

public class DirectoryAlphabeticalOrder {

    public static void printDirectoryContentInAphabeticalOrder(String path) {

            SortFilesFromDirectory.sortFiles(LoadDirectory.loadDirectory(path));
    }
}