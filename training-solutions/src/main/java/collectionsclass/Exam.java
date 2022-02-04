package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> results = getSortedList();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < Math.min(places, results.size()); i++) {
            names.add(results.get(i).getName());
        }
        return names;
    }

    private List<ExamResult> getSortedList() {
        List<ExamResult> results = getExamResults();
        results.sort(new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o1.getPoints() - o2.getPoints();
            }
        });
        Collections.reverse(results);
        return results;
    }
}
