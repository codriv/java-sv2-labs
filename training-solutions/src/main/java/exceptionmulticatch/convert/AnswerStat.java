package exceptionmulticatch.convert;

import java.util.Locale;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter = new BinaryStringConverter();

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String binaryString) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(binaryString);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException("Something went wrong while converting.", exception);
        }
    }

    public int answerTruePercent(String answers) {
        int numOfTrues = 0;
        for (boolean bool: convert(answers)) {
            if (bool == true) {
                numOfTrues++;
            }
        }
        return Integer.parseInt(String.format(Locale.US, "%.0f", (numOfTrues / (double)answers.length() * 100)));
    }
}