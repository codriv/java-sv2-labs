package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println();
        System.out.println(conversion.convertDoubleToDouble(2.2));
        System.out.println();

        int[] intArray = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(intArray)));
        System.out.println();

        System.out.println(conversion.getFirstDecimal(12.254));
    }
}
