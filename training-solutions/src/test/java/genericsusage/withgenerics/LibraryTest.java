package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    List<Book> books = List.of(new Book("elso"), new Book("masodik"), new Book("harmadik"));
    List<Book> booksEmpty = List.of();
    Library library = new Library();

    @Test
    void getFirstBook() {
        assertEquals(books.get(0), library.getFirstBook(books));
    }
}