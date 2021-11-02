package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> coloredCapsules = new ArrayList<>();

    public void addLast(String color) {
        coloredCapsules.add(color);
    }
    public void addFirst(String color) {
        coloredCapsules.add(0, color);
    }
    public void removeLast() {
        coloredCapsules.remove(coloredCapsules.size() - 1);
    }
    public void removeFirst() {
        coloredCapsules.remove(0);
    }
    public List getColors() {
        return coloredCapsules;
    }
}
