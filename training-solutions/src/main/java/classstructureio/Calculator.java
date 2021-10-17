package classstructureio;

import  java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Számológép 1.0");
        System.out.println("Az összeadáshoz adjon meg két egész számot!");
        System.out.println("első szám:");
        Integer firstNumber = scanner.nextInt();
        System.out.println("második szám:");
        Integer secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " + " + secondNumber); // Feladatkiírás szerinti megjelenítés
        System.out.println(firstNumber + secondNumber); // Feladatkiírás szerinti megjelenítés
        System.out.println("\r\nAz eredmény:");
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}
