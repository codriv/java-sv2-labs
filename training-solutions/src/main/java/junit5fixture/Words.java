package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> listToDelete = new ArrayList<>();
        for (String word: words) {
            if (word.startsWith(prefix) == false) {
                listToDelete.add(word);
            }
        }
        words.removeAll(listToDelete);
    }

    public void getWordsWithLength(int length) {
        List<String> listToDelete = new ArrayList<>();
        for (String word: words) {
            if (word.length() != length) {
                listToDelete.add(word);
            }
        }
        words.removeAll(listToDelete);
    }
}
