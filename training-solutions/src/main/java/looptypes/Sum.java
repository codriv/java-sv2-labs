package looptypes;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 5, 11, 9};
        System.out.println("\nA eredeti lista:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\nA számokhoz hozzáadva az előző szám:");
        printSums(numbers);
        System.out.println();
    }
    public static void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print((numbers[i] + numbers[i + 1]) + (i == (numbers.length -1) ? "" : " "));
        }
    }
}
