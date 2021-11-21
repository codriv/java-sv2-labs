package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;

        if (name.isBlank()) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }

        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("A születési dátum legalább 1900 legyen!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Nagy Sándor", "123-456-799", 1952);
//        Patient patient = new Patient(" ", "123-456-799", 1952);
//        Patient patient = new Patient("Nagy Sándor", "123-456-799", 1852);

    }
}
