package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        System.out.println("\nA vers első sora:");
        for (String word: args) {
            System.out.print(word + (word.equals(args[args.length - 1]) ? "\n" : " "));
        };
        System.out.println("\nA vers első sora visszafelé:");
        for (int i = args.length -1; i >= 0; i-- ) {
            System.out.print(args[i] + (i == 0 ? "\n" : " "));
        }
    }
}
