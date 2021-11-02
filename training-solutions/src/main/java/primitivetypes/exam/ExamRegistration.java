package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {

        System.out.println("\nAdja meg a nevét, születési dátumát (ÉÉÉÉ.H.N), irányítószámát és az átlagát!");
        System.out.print("\n név: ");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\.|\\n");
        String name = scanner.nextLine();
        System.out.print(" születési dátum (ÉÉÉÉ.H.N): ");
        scanner.useDelimiter("\\.|\\n");
        String yearString = scanner.next();
        String monthString = scanner.next();
        String dayString = scanner.next();
        scanner.nextLine();
        scanner.reset();
        System.out.print(" irányítószám: ");
        String zipString = scanner.nextLine();
        System.out.print(" átlaga: ");
        String averageString = scanner.nextLine();
        int year = Integer.parseInt(yearString);
        int month = Integer.parseInt(monthString);
        int day = Integer.parseInt(dayString);
        int zip = Integer.parseInt(zipString);
        double average = Double.parseDouble(averageString);

        Exam exam = new Exam();
        exam.getList().add(new Person(name, LocalDate.of(year, month, day), zip, average));
        System.out.println("\nA listához hozzáadva:");
        System.out.println(exam.getList().get(exam.getList().size() - 1));
        System.out.println("\nA teljes lista:\n");
//        System.out.println(exam.getList());
        System.out.println(exam.toString());
    }
}
