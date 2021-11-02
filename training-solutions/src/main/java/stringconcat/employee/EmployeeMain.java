package stringconcat.employee;

import java.util.Locale;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Nagy Sándor", "könyvelő", 520000);
        System.out.println(employee.toString());
        System.out.println("MRS".toLowerCase(Locale.ROOT));
    }

}
