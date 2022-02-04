package searching;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

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
                new Book("AAA", "AATitle"),
                new Book("ÁÁÁ", "ÁÁTitle"),
                new Book("BBB", "BBTitle")
        ));

        Book testBook = new Book("Mikszáth Kálmán", "Beszterce Ostroma");
        Book testFirstBook = new Book("AAA", "AATitle");
        Book testSecondBook = new Book("ÁÁÁ", "ÁÁTitle");
        Book testLastBook = new Book("Móricz Zsigmond", "Rokonok");

        List<Book> testList = bookSearch.getBooks();

        Collections.sort(testList);

//        Collections.sort(testList, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                Collator collator = Collator.getInstance();
//                if (o1.getAuthor().equals(o2.getAuthor())) {
//                    return collator.compare(o1.getTitle(), o2.getTitle());
//                } else {
//                    return collator.compare(o1.getAuthor(), o2.getAuthor());
//                }
//            }
//        });

        assertEquals(testBook, bookSearch.findBookByAuthorTitle("Mikszáth Kálmán", "Beszterce Ostroma"));
        assertEquals(testFirstBook, testList.get(0));
        assertEquals(testSecondBook, testList.get(1));
        assertEquals(testLastBook, testList.get(testList.size() - 1));

        assertEquals("AAA", bookSearch.getBooks().get(0).getAuthor());
        assertEquals("ÁÁÁ", bookSearch.getBooks().get(1).getAuthor());
        assertEquals("Móricz Zsigmond", bookSearch.getBooks().get(bookSearch.getBooks().size() - 1).getAuthor());
        assertEquals("Mikszáth Kálmán", bookSearch.findBookByAuthorTitle("Mikszáth Kálmán", "Beszterce Ostroma").getAuthor());
        assertEquals("Beszterce Ostroma", bookSearch.findBookByAuthorTitle("Mikszáth Kálmán", "Beszterce Ostroma").getTitle());

    }
}