package testing.level1.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    public Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void libraryIsNotNull() {
        assertNotNull(library.getBookList());
    }

    @Test
    void correctSizeAfterAdding() {
        library.addBook("Beyond Good and Evil");
        library.addBook("The Enchiridion");
        library.addBook("Critique of Pure Reason");

        assertEquals(3, library.getBookList().size());
    }

    @Test
    void correctPositionAfterAdding() {
        library.addBook("Beyond Good and Evil");
        library.addBook("The Enchiridion");

        List<String> books = library.getBookList();

        assertEquals("Beyond Good and Evil", books.get(0));
        assertEquals("The Enchiridion", books.get(1));
    }

    @Test
    void getBookAtPositionReturnsCorrectTitle() {
        library.addBook("Beyond Good and Evil");
        library.addBook("The Enchiridion");

        String book = library.getBookAtPosition(1);

        assertEquals("The Enchiridion", book);
    }

    @Test
    void addBookAtPositionModifiesLibraryCorrectly() {
        library.addBook("Beyond Good and Evil");
        library.addBook("Critique of Pure Reason");

        library.addBookAtPosition("The Enchiridion", 2);

        List<String> books = library.getBookList();

        assertEquals("Beyond Good and Evil", books.get(0));
        assertEquals("Critique of Pure Reason", books.get(1));
        assertEquals("The Enchiridion", books.get(2));
    }

    @Test
    void removingByTitleReducesLibrarySize() {
        library.addBook("Beyond Good and Evil");
        library.addBook("Critique of Pure Reason");

        boolean removed = library.removeBook("Beyond Good and Evil");

        assertTrue(removed);
        assertEquals(1, library.getBookList().size());
    }

    @Test
    void getOrderedListIsAlphabeticalAndDoesNotModifyOriginalLibrary() {
        library.addBook("Beyond Good and Evil");
        library.addBook("Critique of Pure Reason");
        library.addBook("The Enchiridion");

        ArrayList<String> ordered = library.getOrderedBookList();

        assertEquals(
                List.of("Beyond Good and Evil", "Critique of Pure Reason", "The Enchiridion"),
                ordered
        );

        assertEquals(
                List.of("Beyond Good and Evil", "Critique of Pure Reason", "The Enchiridion"),
                library.getBookList()
        );
    }

    @Test
    void duplicateTitlesNotAllowed() {
        library.addBook("Beyond Good and Evil");

        library.addBook("Beyond Good and Evil");

        assertEquals(1, library.getBookList().size());
    }

}