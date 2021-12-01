package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("Minimum 1 result required!");
        }
        int limitInPoints = (int) (maxPoints * (limitInPercent / 100d));
        int numberOfTopGrades = 0;
        for (int result: results) {
            if (result >= limitInPoints) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("Minimum 1 result required!");
        }
//        int limitInPoints = (int) (maxPoints * (limitInPercent / 100D));      // trim decimal
        int limitInPoints = Math.round(maxPoints * (limitInPercent / 100F));    // round decimal
        for (int result: results) {
            if (result < limitInPoints) {
                return true;
            }
        }
        return false;
    }
}
