package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        System.out.println("\nA hónapok napjainak száma:");
        System.out.println(numberOfDaysAsString());
        System.out.println();
        System.out.println("7-es szorzótábla:");
        System.out.println(multiplicationTableAsString(5));
        double[] day = {10, 10, 11, 12, 13, 14, 16, 18, 21, 21, 21, 20, 18, 17, 17, 14, 12, 10, 10, 9, 8, 7, 8, 9, 10};
        double[] anotherDay = {10, 10, 11, 12, 13, 14, 16, 18, 21, 21, 21, 20, 18, 17, 17, 14, 12, 10, 10, 9, 8, 7, 8, 9};
        System.out.println("\nMért hőmérsékletek 1. nap:");
        System.out.println(Arrays.toString(day));
        System.out.println("\nMért hőmérsékletek 2. nap:");
        System.out.println(Arrays.toString(anotherDay));
        System.out.println();
        System.out.println(sameTempValues(day, anotherDay) ? "Azonos értékek" : "Eltérő értékek");
        System.out.println("\nÓraátállítást figyelembe véve:");
        System.out.println(sameTempValuesDaylight(day, anotherDay) ? "Azonos értékek" : "Eltérő értékek");
        int[] myNumbers = {67, 24, 35, 12, 87};
        int[] winNumbers = {12, 24, 35, 67, 87};
        System.out.println("\nAz én számaim: ");
        System.out.println(Arrays.toString(myNumbers));
        System.out.println("Nyerőszámok: ");
        System.out.println(Arrays.toString(winNumbers));
        System.out.println(wonLottery(myNumbers, winNumbers) ? "Nyert" : "Nem nyert");
        System.out.println("A számok sorrendje megmaradt:");
        System.out.println(Arrays.toString(myNumbers));
        System.out.println(Arrays.toString(winNumbers));
    }

    public static String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public static String multiplicationTableAsString(int size) {
        int base = 7;
        int[] table = new int[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = base * (i + 1);
        }
        return Arrays.toString(table);
    }

    public static boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public static boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        if (day.length < anotherDay.length) {
            anotherDay = Arrays.copyOfRange(anotherDay, 0, (day.length));
        }
        if (anotherDay.length < day.length) {
            day = Arrays.copyOfRange(day, 0, (anotherDay.length));
        }
        return Arrays.equals(day, anotherDay);
    }
    public static boolean wonLottery(int[] myNumbers, int[] winNumbers) {
        int[] newMyNumbers = Arrays.copyOf(myNumbers, myNumbers.length);
        int[] newWinNumbers = Arrays.copyOf(winNumbers, winNumbers.length);
        Arrays.sort(newMyNumbers);
        Arrays.sort(newWinNumbers);
        return Arrays.equals(newMyNumbers, newWinNumbers);
    }

}