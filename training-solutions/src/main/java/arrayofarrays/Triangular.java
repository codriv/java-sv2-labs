package arrayofarrays;

import java.util.Arrays;

public class Triangular {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(triangularMatrix(4)).replaceAll("], ", "\n").replaceAll("[\\[\\],]", ""));
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
