package introexceptionfinally;

import java.util.Scanner;

public class NumbersFinallyInWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        do {
            System.out.print("Adjon meg egy páros számot: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Nem szám!");
            }
            finally {
                System.out.println("End of round!");
            }
        }
            while (input % 2 == 1);
    }
}
