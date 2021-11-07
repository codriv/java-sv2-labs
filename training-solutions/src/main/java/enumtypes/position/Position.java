package enumtypes.position;

public enum Position {
    PORTER(300_000, "étkezési jegy"), ANALYST(400_000, "üdülési csekk"),
    EXECUTIVE(600_000, "telefon, laptop"), HEAD_OF_DEPARTMENT(800_000, "autó");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
