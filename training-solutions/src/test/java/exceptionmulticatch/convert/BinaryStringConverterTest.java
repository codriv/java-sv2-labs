package exceptionmulticatch.convert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    BinaryStringConverter binaryStringConverter = new BinaryStringConverter();

    @Test
    void binaryStringToBooleanArray() {
        boolean[] bools = {true, true, false, true, false};
        assertTrue(Arrays.equals(bools, binaryStringConverter.binaryStringToBooleanArray("11010")));
    }

    @Test
    void booleanArrayToBinaryString() {
        boolean[] booleans = {true, false, false, true, true, false};
        assertEquals("100110", binaryStringConverter.booleanArrayToBinaryString(booleans));
    }

    @Test
    void nullPointer1Test() {
        NullPointerException npe = assertThrows(NullPointerException.class,
                () -> binaryStringConverter.binaryStringToBooleanArray(null));
        assertEquals("Binary string can not be null!", npe.getMessage());
    }

    @Test
    void nullPointer2Test() {
        NullPointerException npe = assertThrows(NullPointerException.class,
                () -> binaryStringConverter.booleanArrayToBinaryString(null));
        assertEquals("Array of booleans can not be null!", npe.getMessage());
    }

    @Test
    void notBinaryTest() {
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class,
                () -> binaryStringConverter.binaryStringToBooleanArray("011h0"));
        assertEquals("Not binary string!", npe.getMessage());
    }


    @Test
    void emptyArrayTest() {
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class,
                () -> binaryStringConverter.booleanArrayToBinaryString(new boolean[] {}));
        assertEquals("Array of booleans can not be empty!", npe.getMessage());
    }


}