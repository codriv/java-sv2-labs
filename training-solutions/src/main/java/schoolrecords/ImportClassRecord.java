package schoolrecords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ImportClassRecord {

    private List<String> records;

    public ImportClassRecord(Path path) {
        records = readFile(path);
    }

    private List<String> readFile(Path path) {
        try {
            records = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return records;
    }

    public String getClassName() {
        return getName(records.get(0));
    }

    public List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<>();
        for (String subjectName: getParts(records.get(1))[1].split(",")) {
            subjects.add(new Subject(subjectName));
        }
        return subjects;
    }

    public List<Tutor> getTutors() {
        List<Tutor> tutors = new ArrayList<>();
        for (String line: getLines("tutor")) {
            tutors.add(new Tutor(getName(line), getSubjectsOfTutor(line)));
        }
        return tutors;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (String line: getLines("student")) {
            Student student = new Student(getName(line));
            addMarks(line, student);
            students.add(student);
        }
        return students;
    }

    private void addMarks(String line, Student student) {
        String[] subjectsOfStudent = getParts(line)[2].split("/");
        for (String subject: subjectsOfStudent) {
            addMarksBySubject(student, subject);
        }
    }

    private void addMarksBySubject(Student student, String subject) {
        String[] subjectAndMarks = subject.split(":");
        String subjectName = subjectAndMarks[0];
        String[] marksWithTutor = subjectAndMarks[1].split(",");
        for (String mark: marksWithTutor) {
            String[] markWithTutor = mark.split("\\(|\\)");
            MarkType markType = MarkType.valueOf(markWithTutor[0]);
            Tutor tutor = findTutor(markWithTutor[1]);
            student.grading(new Mark(markType, findSubject(subjectName), tutor));
        }
    }

    private List<Subject> getSubjectsOfTutor(String line) {
        List<Subject> subjectsOfTutor = new ArrayList<>();
        for (String subjectName: getParts(line)[2].split(",")) {
            subjectsOfTutor.add(findSubject(subjectName));
        }
        return subjectsOfTutor;
    }

    private String[] getParts(String line) {
        return line.split(";");
    }

    public String getName(String line) {
        return getParts(line)[1];
    }

    private List<String> getLines(String query) {
        List<String> lines = new ArrayList<>();
        for (String line : records) {
            if (line.startsWith(query)) {
                lines.add(line);
            }
        }
        return lines;
    }

    private Subject findSubject(String subjectName) {
        for (Subject subject: getSubjects()) {
            if (subjectName.equals(subject.getName())) {
                return subject;
            }
        }
        return null;
    }

    private Tutor findTutor(String tutorName) {
        for (Tutor tutor: getTutors()) {
            if (tutorName.equals(tutor.getName())) {
                return tutor;
            }
        }
        return null;
    }
}