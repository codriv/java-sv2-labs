package debug;

public class Star {

    public static void main(String[] args) {
        Star star = new Star();
        int[] arrayOfNumbers = {1,2,4,7,9};
        star.writeStars(arrayOfNumbers);
    }
    public void writeStars(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int prev = i == 0 ? 0 : numbers[i - 1];
            int stars = numbers[i] - prev;
            printStars(stars);
            prev = numbers[i];
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
}
