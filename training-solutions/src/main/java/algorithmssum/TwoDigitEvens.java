package algorithmssum;

public class TwoDigitEvens {
    public int getSum() {
        int sumOfOdds = 0;
        for (int i = 10; i < 100; i++) {
            if (((i % 2) == 1) && ((i % 5) != 0)) {
                sumOfOdds += i;
            }
        }
        return sumOfOdds;
    }
}
