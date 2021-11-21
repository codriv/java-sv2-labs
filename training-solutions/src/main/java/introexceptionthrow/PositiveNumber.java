package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív számot: ");
        if (scanner.nextInt() < 0) {
            throw new IllegalArgumentException("Nem pozitív szám!");
        }
    }
}
