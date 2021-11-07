package stringbasic;

public class Student {
    private Person person;
    private String neptunCode;
    private String educationIdentifier;
    private String entranceCardNumber;

    public Student(Person person, String neptunCode, String educationIdentifier) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationIdentifier = educationIdentifier;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationIdentifier() {
        return educationIdentifier;
    }

    public void setEducationIdentifier(String educationIdentifier) {
        this.educationIdentifier = educationIdentifier;
    }

    public String getEntranceCardNumber() {
        return entranceCardNumber;
    }

    public void setEntranceCardNumber(String entranceCardNumber) {
        this.entranceCardNumber = entranceCardNumber;
    }
}
