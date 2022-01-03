package exception.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        ifNull(numbers);
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        ifNull(numbers);
        int sum = 0;
        for (String item: numbers) {
            try {
                sum += Integer.parseInt(item);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number!", nfe);
            }
        }
        return sum;
    }

    private void ifNull(Object numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter is null!");
        }
    }
}