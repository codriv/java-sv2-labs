package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        System.out.println((char)'s');
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nÍrjon be egy szót!");
        String word = scanner.nextLine();
        System.out.println("\nBetűzze le ezt a szót: " + word);
        System.out.println("Adja meg a betűket egyenként!");
        char[] charArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            System.out.print(i + 1 + ". betű: ");
            charArray[i] = scanner.next().charAt(0);
        }
        String newWord = String.copyValueOf(charArray);
        System.out.println(newWord);
        System.out.println("\n" + ((word.equals(newWord)) ? "Helyes" : "Helytelen"));
    }
}
