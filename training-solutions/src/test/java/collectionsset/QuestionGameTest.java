package collectionsset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    List<RightAnswer> solvers = new ArrayList<>(List.of(new RightAnswer("egy"),
                                                        new RightAnswer("ketto"),
                                                        new RightAnswer("harom"),
                                                        new RightAnswer("negy"),
                                                        new RightAnswer("ot"),
                                                        new RightAnswer("hat"),
                                                        new RightAnswer("het"),
                                                        new RightAnswer("harom"),
                                                        new RightAnswer("ketto"),
                                                        new RightAnswer("harom")));

    List<RightAnswer> fewSolvers = new ArrayList<>(List.of(new RightAnswer("harom"),
                                                        new RightAnswer("ketto"),
                                                        new RightAnswer("harom"),
                                                        new RightAnswer("negy"),
                                                        new RightAnswer("harom"),
                                                        new RightAnswer("ketto"),
                                                        new RightAnswer("het"),
                                                        new RightAnswer("harom"),
                                                        new RightAnswer("ketto"),
                                                        new RightAnswer("harom")));

    @Test
    void drawWinnersTest() {
        QuestionGame qg = new QuestionGame(solvers);
        Set<String> winners = qg.drawWinners();
        assertEquals(5, winners.size());
        System.out.println(winners);
    }

    @Test
    void drawWinnersTestWithFewSolver() {
        QuestionGame qg = new QuestionGame(fewSolvers);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> qg.drawWinners());
        assertEquals("There is(are) only 4 solver(s)!", iae.getMessage());
    }
}