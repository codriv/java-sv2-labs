package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        return student.getNeptunCode().equals(anotherStudent.getNeptunCode()) && student.getEducationIdentifier().equals(anotherStudent.getEducationIdentifier());
    }
}
