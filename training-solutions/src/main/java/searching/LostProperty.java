package searching;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty>{

    private String regNumber;
    private String description;
    private LocalDate date;

    public LostProperty(String regNumber, String description, LocalDate date) {
        this.regNumber = regNumber;
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public int compareTo(LostProperty o) {
        Collator collator = Collator.getInstance();
        if (description.equals(o.description)) {
            return date.compareTo(o.date);
        } else {
            return collator.compare(description, o.description);
        }
    }

    @Override
    public String toString() {
        return "LostProperty{" +
                "regNumber='" + regNumber + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}' + "\n";
    }
}
