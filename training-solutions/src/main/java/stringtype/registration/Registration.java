package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("\r\nRegistration Validator 1.0\r\n");
        System.out.println("Regisztrációhoz adja meg az adatokat!");
        String valid = " Helyes";
        String invalid = " Helytelen";
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        System.out.println(" név:");
        System.out.println(userValidator.isValidUsername(scanner.nextLine()) ? valid : invalid);
        System.out.println("\r\n jelszó:");
        String psw1 = scanner.nextLine();
        System.out.println(" jelszó mégegyszer:");
        String psw2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassword(psw1, psw2) ? valid : invalid);
        System.out.println("\r\n email:");
        System.out.println(userValidator.isValidEmail(scanner.nextLine()) ? valid : invalid);
    }
}
