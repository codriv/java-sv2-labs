package stringconcat.nameconcat;

public enum Title2 {
    MR("Mr"), MRS("Mrs"), MS("Ms"), DR("Dr.");

    private final String title;

    Title2(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
