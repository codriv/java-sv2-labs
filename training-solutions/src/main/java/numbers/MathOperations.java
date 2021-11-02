package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("\nMi az eredménye az alábbi műveletnek?");
        System.out.println("(0,0001 pontossággal kérem az eredményt. Ha kell, tizedesvesszőt használjon!)");
        System.out.print("5 + (3 - 2) * 4 / 6 = ");
        Scanner scanner = new Scanner(System.in);
        double solution = scanner.nextDouble();
        double result = 5 + (3 - 2) * (double)4 / 6;
        System.out.println(Math.abs(solution - result) <= 0.0001 ? "Helyes" : "Helytelen");
    }
}
