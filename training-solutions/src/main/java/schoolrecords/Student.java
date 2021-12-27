package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        checkParam(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return new ArrayList<>(marks);
    }

    private void checkParam(String name) {
        Exceptions.argument(name.isBlank(), "Student name must not be empty!");
    }

    private void checkParam(Mark mark) {
        Exceptions.nullPointer((mark == null), "Mark must not be null!");
    }

    public boolean isMarksEmpty() {
        return marks.isEmpty();
    }

    public void grading(Mark mark) {
        checkParam(mark);
        marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        int sumOfMarks = 0;
        for (Mark actualMark: marks) {
            sumOfMarks += actualMark.getMarkType().getMark();
        }
        return getAverageRound(sumOfMarks, marks.size());
    }

    public double calculateSubjectAverage(Subject subject) {
        List<Mark> marksBySubject = getMarksBySubject(subject);
        if (marks.isEmpty() || marksBySubject.isEmpty()) {
            return 0.0;
        }
        int sumOfMarks = 0;
        for (Mark actualMark: marksBySubject) {
            sumOfMarks += actualMark.getMarkType().getMark();
        }
        return getAverageRound(sumOfMarks, marksBySubject.size());
    }

    private double getAverageRound(int sumOfMarks, int numberOfMarks) {
        double averageReal = sumOfMarks / (double)numberOfMarks;
        String averageRound = String.format(Locale.US, "%.2f", averageReal);
        return Double.parseDouble(averageRound);
    }

    private List<Mark> getMarksBySubject(Subject subject) {
        List<Mark> marksBySubject = new ArrayList<>();
        for (Mark actualMark: marks) {
            if (actualMark.getSubject().getName().equals(subject.getName())) {
                marksBySubject.add(actualMark);
            }
        }
        return marksBySubject;
    }

    public boolean isMarksBySubjectEmpty(Subject subject) {
        return getMarksBySubject(subject).isEmpty();
    }

    private String marksToString() {
        StringBuilder marksSB = new StringBuilder();
        for (int i = 0; i < marks.size(); i++) {
            marksSB.append(marks.get(i).toStringFull());
            if (i != marks.size() - 1) {
                marksSB.append(", ");
            }
        }
        return marksSB.toString();
    }

    @Override
    public String toString() {
        return String.format("%s marks: %s", name, marksToString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }
}
