package searching;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class Book implements Comparable<Book> {

    private int id;
    private String author;
    private String title;

    public Book(String author, String title) {
        this.id = Id.getId();
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo (Book o) {
        Collator collator = Collator.getInstance();
        if (author.equals(o.author)) {
//            return title.compareTo(o.title);
            return collator.compare(title, o.title);
        } else {
//            return author.compareTo(o.author);
            return collator.compare(author, o.author);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}' + "\n";
    }
}
