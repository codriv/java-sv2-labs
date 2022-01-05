package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalStateException("Title can not be null or blank!");
        } else {
            this.title = title;
        }
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalStateException("Performers can not be null or empty!");
        } else {
            this.performers = performers;
        }
    }

    public AudioFeatures(String title, int length,  List<String> performers, List<String> composer) {
        this(title, length, performers);
        if (Validators.isEmpty(composer)) {
            throw new IllegalStateException("Composer can not be null or empty!");
        } else {
            this.composer = composer;
        }
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> commonList = new ArrayList<>(performers);
        commonList.addAll(composer);
        return commonList;
    }
}
