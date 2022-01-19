package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author == null || title == null) {
            throw new IllegalArgumentException("Author and Title can not be null!");
        }
        List<Book> booksForSearch = new ArrayList<>(books);
        Collections.sort(booksForSearch);
        int index = Collections.binarySearch(booksForSearch, new Book(author, title));
        if (index < 0) {
            throw new IllegalArgumentException("Book not found!");
        } else {
            return booksForSearch.get(index);
        }
    }
}
