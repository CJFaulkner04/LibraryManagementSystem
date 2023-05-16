package library.management.system;

import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> library = new LibraryManager<>();

        Book test = new Book("To Kill a Mockingbird", 1960, "Harper Lee", "abc123efg456");
        DVD cd = new DVD("Avatar 2: The Way of Water", 2022, "James Cameron", 192);

        library.addItem(test);
        library.addItem(cd);
        library.displayItems();
        System.out.println(test.getItemType());
        library.deleteItem(cd);
        library.displayItems();
    }
}

