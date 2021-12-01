package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position = new Position(0.0, 0.0);

    public Trooper(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        this.position = position;
    }

    public double distanceFrom(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        return this.position.distanceFrom(position);
    }
}