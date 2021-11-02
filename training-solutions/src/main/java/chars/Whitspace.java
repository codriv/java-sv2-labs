package chars;

public class Whitspace {
    public static void main(String[] args) {
        Whitspace whitspace = new Whitspace();
        System.out.println("\n       makeWhitespaceToStar: " + whitspace.makeWhitespaceToStar("Make whitespace to star."));
        System.out.println("replaceAllWhitespacesToStar: " + whitspace.replaceWhitespacesToStar("Make whitespace to star."));
    }

    public String makeWhitespaceToStar(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    public String replaceWhitespacesToStar(String text) {
        return text.replaceAll("\s", "*");
    }
}
