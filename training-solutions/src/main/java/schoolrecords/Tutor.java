package schoolrecords;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects;

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actualSubject: subjects) {
            if (actualSubject.getName().equals(subject.getName())) {
                return true;
            }
        }
        return false;
    }
}
