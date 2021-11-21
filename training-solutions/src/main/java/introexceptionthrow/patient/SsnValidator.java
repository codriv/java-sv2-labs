package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        try {
            Integer.parseInt(ssn);
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("A TAJ szám csak számokból állhat!");
        }
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("A TAJ számnak 9 jegyűnek kell lennie!");
        }
        int sumOfNumbers = 0;
        for ( int i = 0; i < 8; i++) {
            int valueOfChar = Integer.parseInt(String.valueOf(ssn.charAt(i)));
            if (i % 2 == 0) {
                sumOfNumbers += valueOfChar * 3;
            } else {
                sumOfNumbers += valueOfChar * 7;
            }
        }
        return sumOfNumbers % 10 == Integer.parseInt(ssn.substring(8));
    }
}
