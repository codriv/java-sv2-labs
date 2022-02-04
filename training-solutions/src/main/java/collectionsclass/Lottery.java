package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    private List<Integer> balls = new ArrayList<>();
    private List<Integer> winningNumbers = new ArrayList<>();
    private Random random;

    public Lottery() {
        random = new Random();
    }

    public Lottery(Random random) {
        this.random = random;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        validateAndCreteBalls(lotteryType, ballCount);
        int winningNumber = random.nextInt(ballCount) + 1;
        for (int i = 0; i < lotteryType; i++) {
            while (winningNumbers.contains(winningNumber)) {
                winningNumber = random.nextInt(ballCount) + 1;
            }
            winningNumbers.add(winningNumber);
        }
        Collections.sort(winningNumbers);
        return winningNumbers;
    }

    private void validateAndCreteBalls(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Not valid lottery!");
        }
        for (int i = 1; i < ballCount + 1; i++) {
            balls.add(i);
        }
    }
}
