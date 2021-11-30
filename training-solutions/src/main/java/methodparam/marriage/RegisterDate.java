package methodparam.marriage;

import java.time.LocalDate;

public class RegisterDate {
    private String description;
    private LocalDate date;

    public RegisterDate(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", description, date.toString());
    }
}