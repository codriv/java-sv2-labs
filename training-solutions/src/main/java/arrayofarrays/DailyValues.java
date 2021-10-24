package arrayofarrays;

import java.util.Arrays;

public class DailyValues {
    public static void main(String[] args) {
        String year = Arrays.deepToString(getValues());
        System.out.println(year.replaceAll("], ", "\n").replaceAll("[\\[\\],]", ""));
    }

    public static int[][] getValues() {
        int[] month30 = {4, 6, 9, 11};
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};

        int[][] year = new int[12][];
        for (int i = 0; i < month31.length; i++) {
            year[month31[i] - 1] = new int[31];
        }
        for (int j = 0; j < month30.length; j++) {
            year[month30[j] - 1] = new int[30];
        }
        year[1] = new int[28];
        return year;
    }
}
