package schoolrecords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExportClassRecord {

    private List<String> classRecordsString = new ArrayList<>();
    Path path;

    public ExportClassRecord(Path path) {
        this.path = path;
    }

    public void addClassName(ClassRecords classRecords) {
        classRecordsString.add("classname;" + classRecords.getClassName());
    }

    public void addSubjects(List<Subject> subjects) {
        List<String> subjectNames = new ArrayList<>();
        for (Subject subject: subjects) {
            subjectNames.add(subject.getName());
        }
        classRecordsString.add("subjects;" + String.join(",", subjectNames));
    }

    public void addTutors(List<Tutor> tutors) {
        for (Tutor tutor: tutors) {
            classRecordsString.add("tutor;" + tutor.toString());
        }
    }

    public void addStudents(ClassRecords classRecords) {
        for (Student student : classRecords.getStudents()) {
            classRecordsString.add(getStudentString(student));
        }
    }

    private String getStudentString(Student student) {
        return "student;" + student.getName() + ";" + getSubjectsWithMarksString(student);
    }

    private String getSubjectsWithMarksString(Student student) {
        List<String> subjectsWithMarks = new ArrayList<>();
        for (Subject subject : getSubjects(student)) {
            subjectsWithMarks.add(getMarksBySubjectString(student, subject));
        }
        return String.join("/", subjectsWithMarks);
    }

    private String getMarksBySubjectString(Student student, Subject subject) {
        List<String> marksBySubjectString = new ArrayList<>();
        for (Mark mark: getMarksBySubject(student, subject)) {
            marksBySubjectString.add(mark.toStringTutor());
        }
        return subject.getName() + ":" + String.join(",", marksBySubjectString);
    }

    private List<Mark> getMarksBySubject(Student student, Subject subject) {
        List<Mark> marksBySubject = new ArrayList<>();
        for (Mark mark: student.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                marksBySubject.add(mark);
            }
        }
        return marksBySubject;
    }

    private List<Subject> getSubjects(Student student) {
        List<Subject> subjects = new ArrayList<>();
            for (Mark mark: student.getMarks()) {
                if (!subjects.contains(mark.getSubject())) {
                    subjects.add(mark.getSubject());
                }
            }
            return subjects;
        }

    public void writeFile() {
        try {
            Files.write(path, classRecordsString);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}