package operators;

public class Operators {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public String getResultOfDivision(int number, int divisor) {
        return number + " / " + divisor + " = " + (number / divisor) +
                ", maradék: " + (number % divisor);
    }

    public String isNull(String s) {
        return (s != null ? "nem " : "") + "null értékű";
    }

    public boolean isEmpty(String s) {
        return (s == "" || s == null);
    }
}
