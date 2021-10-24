package arrayofarrays;

import java.util.Arrays;

public class Triangular_2 {
    public static void main(String[] args) {
        int[][] triArray = triangularMatrix(4);
        for (int i = 0; i < triArray.length; i++) {
            System.out.println();
            for (int j = 0; j < triArray[i].length; j++) {
                System.out.print(triArray[i][j] + (j == triArray[i].length - 1 ? "" : " "));
            }
        }
        System.out.println();
    }

    public static int[][] triangularMatrix(int size) {
        int[][] mainArray = new int[size][];
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = new int[i + 1];
            for (int j = 0; j < mainArray[i].length; j++) {
                mainArray[i][j] = i;
            }
        }
        return mainArray;
    }
}