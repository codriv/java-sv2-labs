package exceptionmulticatch.convert;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null) {
            throw new NullPointerException("Binary string can not be null!");
        }
        boolean[] booleans= new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            setBooleansItem(binaryString, booleans, i);
        }
        return booleans;
    }

    private void setBooleansItem(String binaryString, boolean[] booleans, int i) {
        if (binaryString.charAt(i) == '0') {
            booleans[i] = false;
        } else if (binaryString.charAt(i) == '1') {
            booleans[i] = true;
        } else {
            throw new IllegalArgumentException("Not binary string!");
        }
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null) {
            throw new NullPointerException("Array of booleans can not be null!");
        } else if (booleans.length == 0) {
            throw new IllegalArgumentException("Array of booleans can not be empty!");
        }
        return binaryString(booleans);
    }

    private String binaryString(boolean[] booleans) {
        StringBuilder binaryString = new StringBuilder();
        for (boolean bool : booleans) {
            if (bool == true) {
                binaryString.append("1");
            } else {
                binaryString.append("0");
            }
        }
        return binaryString.toString();
    }
}