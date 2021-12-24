package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int mark;
    private String markText;

    MarkType(int mark, String markText) {
        this.mark = mark;
        this.markText = markText;
    }

    public int getMark() {
        return mark;
    }

    public String getMarkText() {
        return markText;
    }
}
