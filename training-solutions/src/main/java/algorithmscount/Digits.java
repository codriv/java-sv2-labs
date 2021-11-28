package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int countOfNumbers = 0;
        for (int i = 10; i < 100; i++) {
            if (Math.abs((i / 10) - (i % 10)) == 5) {
                countOfNumbers++;
            }
        }
        return countOfNumbers;
    }
}
