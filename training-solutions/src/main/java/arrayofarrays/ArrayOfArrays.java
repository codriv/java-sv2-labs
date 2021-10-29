package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] a = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        printArrayOfArrays(a);
    }
    public static void printArrayOfArrays(int[][] a) {
//        System.out.println(Arrays.deepToString(a));
        for (int[] item: a) {
            System.out.println(Arrays.toString(item).replaceAll("[\\[\\],]", ""));
        }
    }
}
