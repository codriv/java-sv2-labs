package exceptionmulticatch.convert;

public class InvalidBinaryStringException extends RuntimeException{

    public InvalidBinaryStringException(String message, Throwable cause) {
        super(message, cause);
    }
}
