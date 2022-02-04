package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> sumPerClasses = new HashMap<>();

    public Map<String, Integer> getSumPerClasses() {
        return sumPerClasses;
    }

    public void putFurtherPaper(String className, int kilogramms) {
        sumPerClasses.put(className, sumPerClasses.containsKey(className) ?
                (sumPerClasses.get(className) + kilogramms) : kilogramms);
    }

    public String getWinnerClass() {
        int max = 0;
        String winner = null;
        for (Map.Entry<String, Integer> entry: getSumPerClasses().entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        if (winner == null) {
            throw new IllegalStateException("Container is empty!");
        }
        return winner;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry: getSumPerClasses().entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}
