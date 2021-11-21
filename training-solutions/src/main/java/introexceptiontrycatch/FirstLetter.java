package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("word", "letter", "sentence", "");

        try {
            for (String word: words) {
                System.out.println(word.charAt(0));
            }
        }
        catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println(sioobe.getMessage());
        }

    }
}
