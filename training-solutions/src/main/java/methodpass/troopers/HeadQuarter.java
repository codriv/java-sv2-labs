package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    private Trooper findTrooperByName(String name) {
        Trooper trooperWithName = null;
        for (Trooper trooper: troopers) {
            if (name.equals(trooper.getName())) {
                trooperWithName = trooper;
            }
        }
        return trooperWithName;
    }

    private Trooper findClosestTrooper(Position position) {
        Trooper closest = troopers.get(0);
        double shortest = closest.distanceFrom(position);
        for (Trooper trooper: troopers) {
            double distance = trooper.distanceFrom(position);
            if (distance < shortest) {
                closest = trooper;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position position) {
        trooper.changePosition(position);
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        moveTrooper(findClosestTrooper(position), position);
    }

    public void moveTrooperByName(String name, Position position) {
        if (position == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        moveTrooper(findTrooperByName(name), position);
    }
}