package level1.exercise3;

import level1.exercise3.utils.DirectoryTree;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String pathInput;
        String pathOutput;


        if (args.length >= 2) {
            pathInput = args[0];
            pathOutput = args[1];
        } else {
            System.out.println("No s'han passat els dos arguments. S'utilitzen rutes per defecte.");

            pathInput = "test-dir-Ex2";
            pathOutput = "src" + File.separator + "level1" + File.separator + "exercise3" + File.separator + "FitxerCreatExercici3.txt";

            System.out.println("Directori d'entrada per defecte: " + pathInput);
            System.out.println("Fitxer de sortida per defecte: " + pathOutput);
        }

        try {
            DirectoryTree.enterDirectory(pathInput, pathOutput);
        } catch (IllegalArgumentException | SecurityException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
