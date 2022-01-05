package catalog;

public final class SearchCriteria {

    private String contributor;
    private String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        return new SearchCriteria(null, title);
    }
}
