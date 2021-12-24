package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords classRecords = new ClassRecords("1A", new Random());
    private List<Subject> subjects;
    private List<Tutor> tutors;
    Scanner scanner = new Scanner(System.in);

    public void initSchool() {
        subjects = new ArrayList<>(Arrays.asList(
                new Subject("földrajz"),
                new Subject("matematika"),
                new Subject("biológia"),
                new Subject("zene"),
                new Subject("fizika"),
                new Subject("kémia")));

        tutors = new ArrayList<>(Arrays.asList(
                new Tutor("Nagy Csilla", teaches("földrajz", "biológia")),
                new Tutor("Kis Béla", teaches("fizika", "kémia")),
                new Tutor("Fekete Péter", teaches("matematika", "ének"))));

        classRecords.addStudent(new Student("Kovács Rita"));
        classRecords.addStudent(new Student("Nagy Béla"));
        classRecords.addStudent(new Student("Varga Márton"));
        classRecords.addStudent(new Student("Nagy Sándor"));
        classRecords.addStudent(new Student("Kis Aranka"));
        classRecords.addStudent(new Student("Piros Alma"));
    }

    private List<Subject> teaches(String... subjects) {
        List<Subject> listOfSubjects = new ArrayList<>();
        for (Subject subject: this.subjects) {
            if (Arrays.asList(subjects).contains(subject.getName())) {
                listOfSubjects.add(subject);
            }
        }
        return listOfSubjects;
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
                "11. Kilépés");
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
            case "11": exit();
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
        String markString = scanner.nextLine();
        String subjectString = scanner.nextLine();
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

    public void exit() {
        return;
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.printMenu();
    }
}
