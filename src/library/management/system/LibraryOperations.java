package library.management.system;

public interface LibraryOperations<T> {
    void addItem(T item);
    void deleteItem(T item);
    void displayItems();
}
