package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.print("Adjon meg egy páros számot: ");
            }
            while (Integer.parseInt(scanner.nextLine()) % 2 == 1);
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Nem szám!");
        }
        finally {
            System.out.println("End of round!");
        }
    }
}