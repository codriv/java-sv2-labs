package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);

        int[] twoPower = new int[5];
        for (int i = 0; i < twoPower.length; i++) {
            twoPower[i] = i == 0 ? 1 : twoPower[i - 1] * 2;
            System.out.print(twoPower[i] + (i < (twoPower.length - 1) ? " " : ""));
        }

        System.out.println();

        boolean[] booleans = new boolean[6];
        booleans[0] = false;
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = i == 0 ? false : !booleans[i - 1];
            System.out.print(booleans[i] + (i < (booleans.length - 1) ? " " : ""));
        }
    }
}
