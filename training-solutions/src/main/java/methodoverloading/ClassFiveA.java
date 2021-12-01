package methodoverloading;

import java.util.List;

public class ClassFiveA {

    private List<String> names;

    public ClassFiveA(List<String> names) {
        this.names = names;
    }

    public String getTodayReferringStudent(int number) {
        return names.get(number);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getNumber() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return names.get(Number.valueOf(numberName).getNumber() - 1);
    }
}
