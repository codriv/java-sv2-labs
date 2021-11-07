package enumtypes.position;

public class PositionMain {
    public static void main(String[] args) {
        for (Position position: Position.values()) {
            System.out.println(position.name() + ": " + "\n salary: " + position.getSalary() + "\n benefit: " + position.getBenefit());
            System.out.println("\nExecutive benefit: " + Position.EXECUTIVE.getBenefit());
            System.out.println("Index of analyst: " + Position.ANALYST.ordinal());
        }
    }
}
