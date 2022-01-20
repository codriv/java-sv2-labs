package searching;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    @Test
    void teszt() {
        System.out.println("valami");
    }

    @Test
    void findBookByAuthorTitle() {
        BookSearch bookSearch = new BookSearch(Arrays.asList(
                new Book("Mikszáth Kálmán", "Szent Péter Esernyője"),
                new Book("Kosztolányi Dezső", "Édes Anna"),
                new Book("Móricz Zsigmond", "Légy jó mindhalálig"),
                new Book("Mikszáth Kálmán", "Beszterce Ostroma"),
                new Book("Gárdonyi Géza", "A láthatazlan ember"),
                new Book("Móricz Zsigmond", "Rokonok"),
                new Book("Jókai Mór", "Az arany ember"),
                new Book("Jókai Mór", "A kőszívű ember fiai"),
                new Book("Mikszáth Kálmán", "A Noszty fiú esete Tóth Marival"),
                new Book("Gárdonyi Géza", "Egri csillagok"),
                new Book("Jókai Mór", "Egy magyar nábob"),
                new Book("Mikszáth Kálmán", "Új Zrínyiász")
        ));

        Book testBook = new Book("Mikszáth Kálmán", "Beszterce Ostroma");
        Book testFirstBook = new Book("Gárdonyi Géza", "A láthatazlan ember");
        Book testLastBook = new Book("Móricz Zsigmond", "Rokonok");

        List<Book> testList = bookSearch.getBooks();
        Collections.sort(testList);

        assertEquals(testBook, bookSearch.findBookByAuthorTitle("Mikszáth Kálmán", "Beszterce Ostroma"));
        assertEquals(testFirstBook, testList.get(0));
        assertEquals(testLastBook, testList.get(testList.size() - 1));

    }
}