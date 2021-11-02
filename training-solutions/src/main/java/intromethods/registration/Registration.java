package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("\nRegisztráció\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        String surname = scanner.nextLine();
        System.out.print("Keresztknév: ");
        String forname = scanner.nextLine();
        System.out.print("Születési év: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Születési hónap: ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Születési nap: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();

        Registration registration = new Registration();
        String nev = registration.concatNames(surname, forname);
        Person person = new Person(registration.concatNames(surname, forname), registration.createDate(yearOfBirth, monthOfBirth, dayOfBirth), email);
        System.out.println("\nRegisztrációs adatok:");
        System.out.println(person);

    }

    public String concatNames(String surname, String forname) {
        return surname + " " + forname;
    }

    public LocalDate createDate(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        return LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }


}
