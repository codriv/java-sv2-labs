package methodparam.sums;

import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {
    private double sumPositive;
    private double sumNegative;

    public double getSumPositive() {
        return sumPositive;
    }

    public double getSumNegative() {
        return sumNegative;
    }

    public SeparatedSum sum(String floatingNumbers) {
        for (Double number: getListOfNumbers(floatingNumbers)) {
            if (number > 0) {
                sumPositive += number;
            } else {
                sumNegative += number;
            }
        }
        return this;
    }

    public List<Double> getListOfNumbers(String floatingNumbers) {
        List<Double> listOfNumbers = new ArrayList<>();
        String[] arrayOfNumbersString = floatingNumbers.split(";");
        for (String number: arrayOfNumbersString) {
            listOfNumbers.add(Double.parseDouble(number.replace(",", ".")));
        }
        return listOfNumbers;
    }
}