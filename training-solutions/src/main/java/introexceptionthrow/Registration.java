package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Üdvözöljük!");
        System.out.print("Neve: ");
        String name = scanner.nextLine();
        boolean success = true;
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            success = false;
        }
        System.out.print("Életkor: ");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(ageString);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            success = false;
        }
        System.out.printf("\n Név: %s\n Életkor: %s", name, ageString);
        System.out.printf("\n\nA regisztráció siker%s volt!", (success ? "es" : "telen"));
    }
}
