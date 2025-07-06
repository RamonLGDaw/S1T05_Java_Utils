package level1.exercise1;

import level1.exercise1.utils.DirectoryAlphabeticalOrder;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("S'ha d'introduïr la ruta del directori.");
            return;
        }

        try {
            DirectoryAlphabeticalOrder.printDirectoryContentInAphabeticalOrder(args[0]);

        } catch (IllegalArgumentException | SecurityException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}