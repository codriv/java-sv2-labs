package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String name, Random random) {
        this.className = name;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public boolean addStudent(Student student) {
        return students.contains(student) ? false : students.add(student);
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public double calculateClassAverage() {
        checkStudentsAndMarks();
        double sumOfAverages = 0.0;
        for (StudyResultByName student : listStudyResults()) {
            sumOfAverages += student.getStudyAverage();
        }
        return getAverageRound(sumOfAverages, listStudyResults().size());
    }

    private void checkStudentsAndMarks() {
        Exceptions.arithmetic(students.isEmpty(), "No student in the class, average calculation aborted!");
        Exceptions.arithmetic(isMarksEmpty(), "No marks present, average calculation aborted!");
        }

    private boolean isMarksEmpty() {
        boolean isEmpty = true;
        for (Student student: students) {
            if (!student.isMarksEmpty()) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    private double getAverageRound(double sumOfAverages, int numberOfStudents) {
        double classAverageReal = sumOfAverages / numberOfStudents;
        String classAverageRound = String.format(Locale.US, "%.2f", classAverageReal);
        return Double.parseDouble(classAverageRound);
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sumOfAverages = 0.0;
        int numberOfStudents = 0;
        for (Student student: students) {
            if (!student.isMarksBySubjectEmpty(subject)) {
                sumOfAverages += student.calculateSubjectAverage(subject);
                numberOfStudents++;
            }
        }
        return getAverageRound(sumOfAverages, numberOfStudents);
    }

    public Student findStudentByName(String name) {
        checkParam(name);
        for (Student student: students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    private void checkParam(String name) {
        Exceptions.argument(name.isBlank(), "Student name must not be empty!");
        Exceptions.state(students.isEmpty(), "No students to search!");
    }

    public Student repetition() {
        Exceptions.state(students.isEmpty(), "No students to select for repetition!");
        return students.get(random.nextInt(0, students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> listStudyResults = new ArrayList<>();
        for (Student student: students) {
            listStudyResults.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return listStudyResults;
    }

    public String listStudentNames() {
        StringBuilder listStudentNames = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            listStudentNames.append(students.get(i).getName());
            if (i < students.size() - 1) {
                listStudentNames.append(", ");
            }
        }
        return listStudentNames.toString();
    }
}