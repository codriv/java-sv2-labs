package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    private List<Book> books;

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Library can not be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Library can not be empty!");
        }
        return books.get(0);
    }
}
