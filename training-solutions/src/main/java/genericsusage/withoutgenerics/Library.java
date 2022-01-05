package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    private List books;

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Library can not be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Library can not be empty!");
        }
        return getBook(books);
    }

    private Book getBook(List books) {
        for (Object object: books) {
            if (object instanceof Book) {
                return (Book)object;
            }
        }
        return null;
    }
}
