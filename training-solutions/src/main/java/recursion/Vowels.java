package recursion;

public class Vowels {
        public int getNumberOfVowels(String word) {
        String vowels = "aáeéiíoóöőuúüű";
        if (word.length() > 0) {
            if (vowels.contains(word.substring(0, 1))) {
                return 1 + getNumberOfVowels(word.substring(1));
            } else {
                return 0 + getNumberOfVowels(word.substring(1));
            }
        }
        return 0;
    }
}