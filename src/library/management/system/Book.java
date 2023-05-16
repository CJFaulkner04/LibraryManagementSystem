package library.management.system;

public class Book extends LibraryItem{
    public String author;
    public String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + author + ", Release Year: " + getReleaseYear() + ", ISBN: " + ISBN;
    }
}
