

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Example usage
        library.addBook("123", "Effective Java", "Joshua Bloch", 2008);
        library.addBook("456", "Clean Code", "Robert C. Martin", 2008);
        
        library.borrowBook("123");
        System.out.println("Available books: " + library.getAvailableBooks().size());
        
        library.returnBook("123");
        System.out.println("Available books after return: " + library.getAvailableBooks().size());
    }
    private Map<String, Book> books = new HashMap<>();

    public void addBook(String isbn, String title, String author, int year) {
        if (!books.containsKey(isbn)) {
            books.put(isbn, new Book(isbn, title, author, year));
        }
    }

    public void borrowBook(String isbn) {
        Book book = books.get(isbn);
        if (book == null || !book.isAvailable()) {
            throw new IllegalArgumentException("Book is not available");
        }
        book.setAvailable(false);
    }

    public void returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null) {
            book.setAvailable(true);
        }
    }

    public Map<String, Book> getAvailableBooks() {
        Map<String, Book> availableBooks = new HashMap<>();
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                availableBooks.put(book.getIsbn(), book);
            }
        }
        return availableBooks;
    }
}

class Book {

    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
