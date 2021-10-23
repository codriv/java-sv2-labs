package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        String elso = "Felhasználók listázása";
        String masodik = "Felhasználó felvétele";
        System.out.println("\n1. " + elso);
        System.out.println("2. " + masodik);
        System.out.println("Többi: Kilépés");

        System.out.println("\nVálasszon menüpontot!");
        Scanner scanner = new Scanner(System.in);

//        int típust használva betű beírásakor hibával lépne ki a program.
        String number = scanner.nextLine();

        if (number.equals("1")) {
            System.out.println(elso);
        } else if (number.equals("2")) {
            System.out.println(masodik);
        }
    }
}
