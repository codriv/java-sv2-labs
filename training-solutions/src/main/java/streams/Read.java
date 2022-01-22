package streams;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Read {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
                .filter(book -> book.getNumberOfPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .map(book -> book.getTitle())
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                    Collator collator = Collator.getInstance();
                    return collator.compare(o1, o2);
                    }
                })
                .collect(Collectors.toList());
    }

    public List<String> listAuthors() {
        return books.stream()
                .map(book -> book.getAuthor())
                .distinct().toList();
    }
}
