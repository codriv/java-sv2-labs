package schoolrecords;

import java.nio.file.Path;
import java.util.*;

public class SchoolRecordsController {
    private ClassRecords classRecords;
    private List<Subject> subjects;
    private List<Tutor> tutors;
    Scanner scanner = new Scanner(System.in);

    public void selectClass() {
        System.out.println("Osztály: ");
        String className = scanner.nextLine();
        Path path = Path.of("src/main/resources/schoolrecords/" + className + ".txt");
        initSchool(path);
    }

    public void initSchool(Path path) {
        ImportClassRecord importClassRecord = new ImportClassRecord(path);
        classRecords = new ClassRecords(importClassRecord.getClassName(), new Random());
        subjects = importClassRecord.getSubjects();
        tutors = importClassRecord.getTutors();
        for (Student student: importClassRecord.getStudents()) {
            classRecords.addStudent(student);
        }
    }

    public void printMenu() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Napló mentése [" + classRecords.getClassName() + "]\n" +
                "12. Osztály választása\n" +
                "13. Kilépés");
        select();
    }

    public void select() {
        System.out.print("Menüpont: ");
        String selected = scanner.nextLine();
        switch (selected) {
            case "1":
                System.out.println(listStudentNames());
                printMenu();
                break;
            case "2":
                System.out.println(findStudentByName());
                printMenu();
                break;
            case "3": addStudent();
                printMenu();
                break;
            case "4": removeStudent();
                printMenu();
                break;
            case "5": repetition();
                printMenu();
                break;
            case "6": System.out.println(calculateClassAverage());
                printMenu();
                break;
            case "7": System.out.println(calculateClassAverageBySubject());
                printMenu();
                break;
            case "8": System.out.println(listStudyResults());
                printMenu();
                break;
            case "9": System.out.println(calculateAverageByName());
                printMenu();
                break;
            case "10": System.out.println(calculateSubjectAverage());
                printMenu();
                break;
            case "11": save();
                printMenu();
                break;
            case "12": selectClass();
                printMenu();
                break;
            case "13": exit();
        }
    }

    public String listStudentNames() {
        return "  " + classRecords.listStudentNames().replace(", ", "\n  ");
    }

    public String findStudentByName() {
        String name = scanner.nextLine();
        return classRecords.findStudentByName(name).toString();
    }

    public void addStudent() {
        String name = scanner.nextLine();
        classRecords.addStudent(new Student(name));
    }

    public void removeStudent() {
        String name = scanner.nextLine();
        Student student = classRecords.findStudentByName(name);
        classRecords.removeStudent(student);
    }

    public void repetition() {
        Student student = classRecords.repetition();
        System.out.println("Felelő diák: " + student.getName());
        System.out.print("Érdemjegy: ");
        String markString = scanner.nextLine();
        System.out.print("Tantárgy: ");
        String subjectString = scanner.nextLine();
        System.out.print("Tanár: ");
        String tutorString = scanner.nextLine();
        Mark mark = new Mark(MarkType.valueOf(markString),
                findSubjectByName(subjectString), findTutorByName(tutorString));
        student.grading(mark);
    }

    private Subject findSubjectByName(String subject) {
        for (Subject actualSubject: subjects) {
            if (subject.equals(actualSubject.getName())) {
                return actualSubject;
            }
        }
        throw new IllegalStateException("Subject not found!");
    }

    private Tutor findTutorByName(String name) {
        for (Tutor tutor: tutors) {
            if (name.equals(tutor.getName())) {
                return tutor;
            }
        }
        throw new IllegalStateException("Tutor not found!");
    }

    public double calculateClassAverage() {
        return classRecords.calculateClassAverage();
    }

    public double calculateClassAverageBySubject() {
        String subjectString = scanner.nextLine();
        return classRecords.calculateClassAverageBySubject(findSubjectByName(subjectString));
    }

    public String listStudyResults() {
        return studyResultsToString(classRecords.listStudyResults());
    }

    private String studyResultsToString(List<StudyResultByName> studyResults) {
        StringBuilder studyResultsSB = new StringBuilder();
        for (int i = 0; i < studyResults.size(); i++) {
            studyResultsSB.append(" " + studyResults.get(i));
            if (i < studyResults.size() - 1) {
                studyResultsSB.append("\n");
            }
        }
        return studyResultsSB.toString();
    }

    public Double calculateAverageByName() {
        String name = scanner.nextLine();
        return classRecords.findStudentByName(name).calculateAverage();
    }

    public Double calculateSubjectAverage() {
        String name = scanner.nextLine();
        String subjectString = scanner.nextLine();
        Subject subject = findSubjectByName(subjectString);
        return classRecords.findStudentByName(name).calculateSubjectAverage(subject);
    }

    private void save() {
        Path path = Path.of("src/main/resources/schoolrecords/" + classRecords.getClassName() + ".txt");
        ExportClassRecord exportClassRecord = new ExportClassRecord(path);
        exportClassRecord.addClassName(classRecords);
        exportClassRecord.addSubjects(subjects);
        exportClassRecord.addTutors(tutors);
        exportClassRecord.addStudents(classRecords);
        exportClassRecord.writeFile();
    }

    public void exit() {
        return;
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.selectClass();
        schoolRecordsController.printMenu();
    }
}
