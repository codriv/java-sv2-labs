package array;

import java.util.Arrays;

public class ArrayHandler {
    public static void main(String[] args) {
        System.out.println("\nArrayHandler 1.0\n");
        int[] numbers = {2, 8, 15, 32, 65};
        String[] words = {"hétfő", "kedd", "szerda", "csütörtök", "péntek"};
        addIndexToNumber(numbers);
        System.out.println();
        concatenateIndexToWord(words);
    }

    public static void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print(i + ": " + source[i] + " -->  " + source[i] + " + " + i + " = ");
            source[i] += i;
            System.out.println(source[i]);
        }
        System.out.println("Eredmény egy sorban: " + Arrays.toString(source).replaceAll("[\\[\\]]", ""));

    }
    public static void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + ": " + source[i];
            System.out.println(source[i]);
        }
        System.out.println("Eredmény egy sorban: " + Arrays.toString(source).replaceAll("[\\[\\]]", ""));
    }
}
