package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> solutions;

    public QuestionGame(List<RightAnswer> solutions) {
        this.solutions = new ArrayList<>(solutions);
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        Random random = new Random();
        RightAnswer winner;
        while (winners.size() < 5) {
            if (solutions.size() == 0) {
                throw new IllegalArgumentException("There is(are) only " + winners.size() + " solver(s)!");
            }
            winner = solutions.get(random.nextInt(0, solutions.size()));
            winners.add(winner.getName());
            solutions.removeAll(List.of(winner));
        }
        return winners;
    }
}
