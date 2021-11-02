package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Kis Géza", 1985, 125800);
        System.out.println("\nAz Employee objektum állapota:");
        System.out.println(employee.toString());
    }
}
