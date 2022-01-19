package searching;

import java.text.Collator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> objects = new ArrayList<>();

    public List<LostProperty> getObjects() {
        return objects;
    }

    public void addObject(LostProperty object) {
        objects.add(object);
        Collections.sort(objects);
    }

    LostProperty findLostProperty(String description) {
        int index = Collections.binarySearch(objects,
                new LostProperty("AN456", description, LocalDate.of(2022, 1, 15)),
                new Comparator<LostProperty>() {
                    @Override
                    public int compare(LostProperty o1, LostProperty o2) {
                        Collator collator = Collator.getInstance();
                        return collator.compare(o1.getDescription(), o2.getDescription());
                    }
                });
        if (index < 0) {
            throw new IllegalArgumentException("Object not found!");
        } else {
            return objects.get(index);
        }
    }
}
