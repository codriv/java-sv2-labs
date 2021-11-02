package conversions;

public class TooBigNumber {
    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(12504));
    }

    public long getRightResult(int number) {
        return 2_147_483_647L + number; // 2_147_483_647 + (long)number;
    }
}
