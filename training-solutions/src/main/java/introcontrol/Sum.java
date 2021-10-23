package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("\nÖsszegszámítás 1.0\n");
        System.out.println("Adjon meg öt egész számot!");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 5;
        
        for (int i = 1; i <= numbers; i++) {
            System.out.print(" " + i + ". szám: ");
            sum += scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("___________________________________");
        System.out.println("A megadott " + numbers + " szám összege: " + sum);
    }
}
