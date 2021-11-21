package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy legfeljebb 5 betűs szót!");
        String text = scanner.nextLine();
        if (text.length() > 5) {
            throw new IllegalArgumentException("Ez hosszabb, mint 5 betű!");
        }
//        if (text.matches(".*[^a-zA-Z].*")) {throw new IllegalArgumentException("Nem betűt is tartalmaz!");}
        for (Character character: text.toCharArray()) {
            if (!Character.isAlphabetic(character)) {
                throw new IllegalArgumentException("Nem betűt is tartalmaz!");
            }
        }
        System.out.println(text);
    }
}
