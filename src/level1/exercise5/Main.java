package level1.exercise5;

import level1.exercise5.model.Book;
import level1.exercise5.utils.ObjectSerializer;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "src" + File.separator + "level1" + File.separator + "exercise5" + File.separator + "Book.ser";

        Book book = new Book("Clean Code", "Robert C. Martin", 2008);
        ObjectSerializer.serialize(book, path);
        Object object = ObjectSerializer.deserialize(path);

        if (object instanceof Book) {
            System.out.println("Objecte recuperat: " + object);
        }
    }
}
