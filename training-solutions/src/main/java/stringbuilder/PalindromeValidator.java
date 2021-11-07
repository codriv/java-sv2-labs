package stringbuilder;

public class PalindromeValidator {
    public static void main(String[] args) {
        String word = "IndulAGörögAludni";
        PalindromeValidator pv = new PalindromeValidator();
        System.out.println(pv.isPalindrome(word));
    }
    public boolean isPalindrome(String word){
        StringBuilder text = new StringBuilder(word.toLowerCase());
        return text.toString().equals(text.reverse().toString());
    }
}
