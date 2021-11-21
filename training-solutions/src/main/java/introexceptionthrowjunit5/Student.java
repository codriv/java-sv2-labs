package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> notes = new ArrayList<>();

    public List<Integer> getNotes() {
        return notes;
    }

    public void addNote(int note) {
        if (0 > note || note > 5) {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        notes.add(note);
    }
}