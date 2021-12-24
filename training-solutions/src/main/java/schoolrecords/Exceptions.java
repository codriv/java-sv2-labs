package schoolrecords;

public class Exceptions {

    public static void state(boolean isEmpty, String message) {
        if (isEmpty) {
            throw new IllegalStateException(message);
        }
    }

    public static void argument(boolean isEmpty, String message) {
        if (isEmpty) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void arithmetic(boolean isEmpty, String message) {
        if (isEmpty) {
            throw new ArithmeticException(message);
        }
    }

    public static void nullPointer(boolean isNull, String message) {
        if (isNull) {
            throw new NullPointerException(message);
        }
    }
}
