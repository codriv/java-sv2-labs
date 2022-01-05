package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.title = Validators.isBlank(title) ? null : title;
        this.numberOfPages = Validators.isNegative(numberOfPages) ? 0 : numberOfPages;
        this.authors = Validators.isEmpty(authors) ? null : authors;;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }
}
