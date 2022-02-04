package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Pisti", 1983));
        employees.add(new Employee("Karcsi", 1982));
        employees.add(new Employee("Feri", 1988));
        employees.add(new Employee("Sári", 1981));
        employees.add(new Employee("Mari", 1998));

        int sumOfYears = 0;
        for (Employee employee:employees) {
            sumOfYears += employee.getYearOfBirth();
        }
        System.out.println(sumOfYears);

        System.out.println(employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .sum());

        int sumOfAges = 0;
        for (Employee employee: employees) {
            sumOfAges += (LocalDate.now().getYear() - employee.getYearOfBirth());
        }
        System.out.println(sumOfAges);

        System.out.println(employees.stream()
                .mapToInt(employee -> (LocalDate.now().getYear() - employee.getYearOfBirth()))
                .sum());

        System.out.println(employees.stream().count());
        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count());
        System.out.println(employees.stream()
                .min(Comparator.comparingInt(o -> o.yearOfBirth)).get().getYearOfBirth());
        System.out.println(employees.stream()
                .map(employee -> employee.getYearOfBirth())
                .sorted()
                .findFirst()
                .get());
        System.out.println(employees.stream()
                .map(employee -> employee.getYearOfBirth())
                .sorted()
                .collect(Collectors.toList())
                .get(0));
        System.out.println(employees.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfBirth))
                .findFirst()
                .get()
                .name);
        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1980)
                .count() == employees.size());

        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList()));

        System.out.println(employees.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList()));

        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(employee -> employee.getName())
                .collect(Collectors.toList()));
    }
}
