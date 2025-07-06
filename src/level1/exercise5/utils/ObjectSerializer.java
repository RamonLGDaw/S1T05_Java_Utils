package level1.exercise5.utils;

import java.io.*;

public class ObjectSerializer {

    public static void serialize(Object object, String path) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(object);
            System.out.println("Objecte serialitzat a: " + path);
        } catch (IOException e) {
            System.err.println("La serialització ha fallat: " + e.getMessage());
        }
    }

    public static Object deserialize(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            Object object = objectInputStream.readObject();
            System.out.println("Objecte deserialitzat desde: " + path);
            return object;
        } catch (IOException e) {
            System.err.println("Deserialització fallida: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found during deserialization: " + e.getMessage());
        }

        return null;
    }
}