package introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.print("Adjon meg egy páros számot: ");
            }
            while (scanner.nextInt() % 2 == 1);
        }
        catch (InputMismatchException ime) {
            throw new IllegalArgumentException("Nem szám!");
        }
        finally {
            System.out.println("End of round!");
        }
    }
}
