package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Regisztráció 1.0");
        System.out.println("Adja meg a nevét és az email címét!");
        System.out.println(" Mi a neve?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Mi az email címe?");
        String email = scanner.nextLine();
        System.out.println("\r\nÖn a következő adatokkal regisztrált:");
        System.out.println(" név: " + name);
        System.out.println(" email: " + email);
    }
}
