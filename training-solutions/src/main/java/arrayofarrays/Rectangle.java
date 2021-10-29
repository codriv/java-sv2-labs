package arrayofarrays;

import java.util.Arrays;

public class Rectangle {
    public static void main(String[] args) {
        String matrix = Arrays.deepToString(rectangularMatrix(4));
        System.out.println(matrix.replaceAll("], ", "\n").replaceAll("[\\[\\],]", ""));
    }

    public static int[][] rectangularMatrix(int size) {
        int[][] mainArray = new int[size][size];
        for (int i = 0; i < mainArray.length; i++) {
            for (int j = 0; j < mainArray[i].length; j++) {
                mainArray[i][j] = i;
            }
        }
        return mainArray;
    }
}
