package numbers;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);
        System.out.print("alap: ");
        int base = scanner.nextInt();
        scanner.nextLine();
        System.out.print("százalékláb: ");
        int percentage = scanner.nextInt();
        scanner.nextLine();
        System.out.println(base + " " + percentage + "%-a: " + percent.getValue(base, percentage));

        System.out.println();

        System.out.print("százalékérték: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        System.out.print("százalékláb: ");
        percentage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("a szám, aminek " + percentage + "%-a " + value + ": " + percent.getBase(value, percentage));

        System.out.println();

        System.out.print("alap: ");
        base = scanner.nextInt();
        scanner.nextLine();
        System.out.print("százalékérték: ");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println(base + " " + percent.getPercent(base, value) + "%-a: " + value);
        System.out.println();


    }
    public double getValue(int base, int percentage) {
        return base * ((double)percentage / 100);
    }

    public double getBase(int value, int percentage) {
        return value / ((double)percentage / 100);
    }

    public double getPercent(int base, int value) {
        return ((double)value / base) * 100;
    }
}
