

public class Main {
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
}
