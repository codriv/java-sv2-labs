package defaultconstructor;

import java.util.Arrays;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Date is not correct!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        return  0 < day && day <= calculateMonthLength(year, month) && year > 1900;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};
        int[] month30 = {4, 6, 9, 11};
        if (Arrays.asList(month31).contains(month)) {
            return 31;
        } else if (Arrays.asList(month30).contains(month)) {
            return 30;
        } else {
            return isLeapYear(year) ? 29 : 28;
        }
    }
}
