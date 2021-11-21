package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    private int numA;
    private int numB;
    String operation;
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    public void giveNumberA() {
        System.out.print("Adjon meg egy számot: ");
        String numberA = scanner.nextLine();
        try {
            numA = Integer.parseInt(numberA);
            giveNumberB();
        }
        catch (NumberFormatException nfe) {
            System.out.println(" Nem számot adott meg!");
//            giveNumberA();
        }
    }

    public void giveNumberB() {
        System.out.print("Adjon meg még egy számot: ");
        String numberB = scanner.nextLine();
        try {
            numB = Integer.parseInt(numberB);
            printMenu();
        }
        catch (NumberFormatException nfe) {
            System.out.println(" Nem számot adott meg!");
//            giveNumberB();
        }
    }

    public void printMenu() {
        System.out.println("\nMilyen műveletet szeretne elvégezni?");
        System.out.println(" 1. összeadás\n 2. kivonás\n 3. szorzás\n 4. osztás");
        operation = scanner.nextLine();
        operation();
    }

    public void operation() {
        switch (operation) {
            case "1":
                System.out.printf("%d + %d = %d", numA, numB, calculator.addition(numA, numB));
                break;
            case "2":
                System.out.printf("%d - %d = %d", numA, numB, calculator.subtraction(numA, numB));
                break;
            case "3":
                System.out.printf("%d x %d = %d", numA, numB, calculator.multiplication(numA, numB));
                break;
            case "4":
                System.out.printf("%d : %d =", numA, numB);
                try {
                    System.out.printf(" %d", calculator.division(numA, numB));
                }
                catch (ArithmeticException ae) {
                    System.out.println("\n0-val való osztás!");
                }
                break;
            default:
                System.out.println("\nAdjon meg egy számot 1-4-ig!");
                printMenu();
        }
    }
    public static void main(String[] args) {
        CalculatorMain calculatorMain = new CalculatorMain();
        calculatorMain.giveNumberA();
    }
}
