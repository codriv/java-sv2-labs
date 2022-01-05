package catalog;

public final class SearchCriteria {

    private String contributor;
    private String title;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
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

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (Validators.isBlank(contributor) || Validators.isBlank(title)) {
            return null;
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return Validators.isBlank(contributor) ? null : new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        return Validators.isBlank(title) ? null : new SearchCriteria(title,null);
    }

    public boolean hasTitle() {
        return title != null;
    }

    public boolean hasContributor() {
        return contributor != null;
    }
}
