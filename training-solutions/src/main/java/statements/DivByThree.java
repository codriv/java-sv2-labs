package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\r\nOsztható 3-mal 1.0\r\n");
        System.out.println("Adjon meg egy egész számot!");
        int num = scanner.nextInt();
        System.out.println(num + (num % 3 == 0 ? "" : " nem") + " osztható 3-mal.");
    }
}
