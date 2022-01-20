package searching;

import java.text.Collator;
import java.util.*;

public class Book implements Comparable<Book> {

    private int id;
    private String author;
    private String title;
    private static List<Integer> ids = new ArrayList<>();

    public Book(String author, String title) {
        setId();
        this.author = author;
        this.title = title;
    }

    public void setId() {
        Random random = new Random();
        int randomId = random.nextInt(1000);
        while (ids.contains(randomId)) {
            randomId = random.nextInt(1000);
        }
        id = randomId;
        ids.add(randomId);
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
            return collator.compare(title, o.title);
        } else {
            return collator.compare(author, o.author);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}