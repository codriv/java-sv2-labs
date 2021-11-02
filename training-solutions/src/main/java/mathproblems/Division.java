package mathproblems;

public class Division {
    public static void main(String[] args) {
        Division division= new Division();
        division.getDivisors(12);
        System.out.println();
        int[] numbers = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(numbers);
    }
    public void getDivisors(int number) {
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
        System.out.println(number + " osztója: " + number);
    }

    public void getRightNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0) {
                System.out.print(numbers[i] + ((i == numbers.length - 1) ? "" : ", "));
            }
        }
    }
}
