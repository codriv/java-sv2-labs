package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public List getTitles() {
        return titles;
    }

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (titles.contains(title)) {
            titles.set(titles.indexOf(title), (author + ": " + title));
        } else {
            System.out.println("Nincs ilyen című könyv a listában!");
        }
    }
}
