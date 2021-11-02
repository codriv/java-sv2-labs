package chars;

public class LettersAndDigits {
    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("hg(.N- 3w");
    }

    public void printLetterOrDigit(String text) {
        char[] charArray = text.toCharArray();
        System.out.println();
        for (char character: charArray) {
            System.out.println(character + ": " +
                (Character.isAlphabetic(character) ? "betű" : (
                        Character.isDigit(character) ? "szám" : "egyéb"
                        )));
        }
    }
}
