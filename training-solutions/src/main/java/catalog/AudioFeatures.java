package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this.title = Validators.isBlank(title) ? null : title;
        this.length = Validators.isNegative(length) ? 0 : length;
        this.performers = Validators.isEmpty(performers) ? null : performers;
    }

    public AudioFeatures(String title, int length,  List<String> performers, List<String> composer) {
        this(title, length, performers);
        this.composer = Validators.isEmpty(composer) ? null : composer;
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
        List<String> commonList = new ArrayList<>();
        if (composer != null) {
            commonList.addAll(composer);
        }
        commonList.addAll(performers);
        return commonList;
    }
}
