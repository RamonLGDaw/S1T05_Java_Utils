package level1.exercise4;

import level1.exercise4.utils.TxtFileReader;

public class Main {
    public static void main(String[] args) {

        String inputPath;

        if (args.length >= 1) {
            inputPath = args[0];
        } else {
            System.out.println("En no introduïr la ruta a un fitxer, es farà servir una per defecte.");
            inputPath = "src/level1/exercise4/TestFileExercise4.txt";
        }

        try {
            TxtFileReader.readAndPrintFile(inputPath);
        } catch  (IllegalArgumentException | SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}