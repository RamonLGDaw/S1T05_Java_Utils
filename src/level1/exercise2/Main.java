package level1.exercise2;

import level1.exercise2.utils.DirectoryTree;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("S'ha d'introduïr la ruta del directori.");
            return;
        }

        try {
            DirectoryTree.enterDirectory(args[0]);
        } catch (IllegalArgumentException | SecurityException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
