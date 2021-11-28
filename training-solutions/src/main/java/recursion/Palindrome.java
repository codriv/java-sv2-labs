package recursion;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word.length() > 1) {
            String first = word.substring(0, 1);
            String last = word.substring(word.length() - 1);
            String middle = word.substring(1, (word.length() - 1));
            if (first.equals(last)) {
                isPalindrome(middle);
            } else {
                return false;
            }
        }
        return true;
    }
}
