package level1.exercise5.model;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Llibre: " + title + " escrit per " + author + " (" + year + ")";
    }
}
