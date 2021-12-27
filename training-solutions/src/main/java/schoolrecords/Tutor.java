package schoolrecords;

import java.util.ArrayList;
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

    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actualSubject: subjects) {
            if (actualSubject.getName().equals(subject.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        List<String> subjectNames = new ArrayList<>();
        for (Subject subject: subjects) {
            subjectNames.add(subject.getName());
        }
        return name + ";" + String.join(",", subjectNames);
    }

//    @Override
//    public String toString() {
//        return name + ":" + subjects;
//    }
}
