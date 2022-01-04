package exceptionmulticatch.convert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());

    @Test
    void convertArgument() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert("011k2"));
        assertEquals("Something went wrong while converting.", ibse.getMessage());
    }

    @Test
    void convertNull() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert(null));
        assertEquals("Something went wrong while converting.", ibse.getMessage());
    }

    @Test
    void answerTest() {
        assertEquals(60, answerStat.answerTruePercent("1001011011"));
    }

    @Test
    void answerTruePercent() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.answerTruePercent("011k2"));
        assertEquals("Something went wrong while converting.", ibse.getMessage());

    }

    @Test
    void answerNull() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert(null));
        assertEquals("Something went wrong while converting.", ibse.getMessage());
    }
}