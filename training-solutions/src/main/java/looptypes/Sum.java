package looptypes;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 5, 11, 9};
        printSums(numbers);
    }
    public static void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print((numbers[i] + numbers[i + 1]) + (i == (numbers.length -1) ? "" : " "));
        }
    }
}
