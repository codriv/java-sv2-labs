package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name, LocalDate dateOfBirth) {
        this.name = name;
        addDateOfBirth(dateOfBirth);
    }

    private void addDateOfBirth(LocalDate dateOfBirth) {
        registerDates.add(new RegisterDate("születés ideje", dateOfBirth));
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}