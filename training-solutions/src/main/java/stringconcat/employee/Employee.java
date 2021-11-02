package stringconcat.employee;

public class Employee {
    private String name;
    private String employment;
    private int salary;

    public Employee(String name, String employment, int salary) {
        this.name = name;
        this.employment = employment;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n " + name + " - " + employment + " - " + salary + " Ft";
    }
}
