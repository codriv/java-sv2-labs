package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String wordLimit) {
        for (String word: words) {
            if (word.length() > wordLimit.length()) {
                return true;
            }
        }
        return false;
    }
}
