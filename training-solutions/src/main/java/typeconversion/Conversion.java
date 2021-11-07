package typeconversion;

import java.util.Arrays;

public class Conversion {
    public double convertDoubleToDouble(double num) {
        int convertedNum = (int)num;
        return (double)convertedNum;
    }

    public byte[] convertIntArrayToByteArray(int[] intArray) {
        byte[] byteArray = new byte[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            byteArray[i] = (0 <= intArray[i] && intArray[i] <= 127) ? (byte)intArray[i] : (byte)-1;
        }
        return byteArray;
    }

    public int getFirstDecimal(double num) {
        int intNum = (int)num;
        return (int)((num - intNum) * 10);
    }
}
