


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("123", "Effective Java", "Joshua Bloch", 2008);
        assertEquals(1, library.getAvailableBooks().size());
    }

    @Test
    public void testBorrowBook() {
        library.addBook("123", "Effective Java", "Joshua Bloch", 2008);
        library.borrowBook("123");
        assertEquals(0, library.getAvailableBooks().size());
    }

    @Test
    public void testReturnBook() {
        library.addBook("123", "Effective Java", "Joshua Bloch", 2008);
        library.borrowBook("123");
        library.returnBook("123");
        assertEquals(1, library.getAvailableBooks().size());
    }
}
