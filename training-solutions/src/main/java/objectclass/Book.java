package objectclass;

import java.util.Objects;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Book)) return false;
//        Book book = (Book) o;
//        return author.equals(book.author) && title.equals(book.title);
//    }
}
