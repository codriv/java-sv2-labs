package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public static void main(String[] args) {
        int[] numbers = {2,6,3,5,8,4,9,1,9,4,5,8,7,6};
        System.out.println("\nAz redeti tömb:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\nAz utolsótól visszafelé minden harmadik 0:");
        System.out.println(Arrays.toString(changeToZero(numbers)));
    }

    public static int[] changeToZero(int[] numbers) {
        numbers[numbers.length - 1] = 0;
        for ( int i = numbers.length - 1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }
}
