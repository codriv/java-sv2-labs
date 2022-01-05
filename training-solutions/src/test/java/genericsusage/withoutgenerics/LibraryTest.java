package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    List books = List.of("elso", new Book("masodik"), new Book("harmadik"));
    List booksEmpty = List.of();
    Library library = new Library();

    @Test
    void getFirstBook() {
        assertEquals(books.get(1), library.getFirstBook(books));
    }
}