package chars;

public class Words {
    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("alma"));
    }
    public String pushWord(String word){
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += 1;
        }
        return new String(charArray);
    }
}
