package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("\nEmployee 1.0\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A belépéshez adja meg az adatait!");
        System.out.println(" név:");
        String name = scanner.nextLine();
        System.out.println(" születési dátum [É H N] formában:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);
        System.out.println("\nAz ön adatai:");
        System.out.println(" név: " + employee.getName());
        System.out.println(" született: " + LocalDate.of(year, month, day).toString().replace("-", ". ") + ".");
        System.out.println(" belépés napja: " + LocalDate.now().toString().replace("-", ". ") + ".");
    }
}
