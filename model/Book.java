package model;

public class Book {

    private final Long id;
    private final String title;
    private final String author;
    private final int publicationYear;
    private boolean available;

    public Book(Long id, String title, String author,int publicationYear) {

        /*if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Tytuł nie moze byc pusty!");
        }

        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Książka musi zawierać informacje o autorze!");
        }*/


        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }
    public void markBorrowed() {
        this.available = false;
    }

    public void markAvailable() {
        this.available = true;
    }

    @Override
    public String toString(){
        return "Książka :" + this.title + ", Autor: " + this.author + ", Rok wydania: " + this.publicationYear + ".";
    }
}
