package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    Issue firstIssue = new Issue("ElsoIssue",
            LocalDateTime.of(2022, 1, 20, 10, 30),
            Status.NEW);

    @BeforeEach
    void addComments() {
        firstIssue.getComments().add(new Comment("elsoKomment",
                LocalDateTime.of(2022, 1, 20, 9, 45)));
        firstIssue.getComments().add(new Comment("masodikKomment",
                LocalDateTime.of(2022, 1, 20, 10, 55)));
        firstIssue.getComments().add(new Comment("harmadikKomment",
                LocalDateTime.of(2022, 1, 20, 12, 20)));
    }

    @Test
    void constructorTest() {
        assertEquals("ElsoIssue", firstIssue.getName());
        assertEquals(Status.NEW, firstIssue.getStatus());
        assertEquals(LocalDateTime.of(2022, 1, 20, 10, 55), firstIssue.getComments().get(1).getTime());
        assertEquals("harmadikKomment", firstIssue.getComments().get(2).getText());
    }

    @Test
    void copyConstructorTest() {

        Issue secondIssue = new Issue(firstIssue, CopyMode.WITH_COMMENTS);

        assertEquals("ElsoIssue", secondIssue.getName());
        assertEquals(Status.NEW, secondIssue.getStatus());
        assertEquals(LocalDateTime.of(2022, 1, 20, 10, 55), secondIssue.getComments().get(1).getTime());
        assertEquals("harmadikKomment", secondIssue.getComments().get(2).getText());
        assertEquals(3, secondIssue.getComments().size());
        secondIssue.getComments().get(2).setText("negyedikKomment");
        assertEquals("negyedikKomment", secondIssue.getComments().get(2).getText());

        assertEquals("harmadikKomment", firstIssue.getComments().get(2).getText());

    }

    @Test
    void copyConstructorWithoutCommentsTest() {

        Issue thirdIssue = new Issue(firstIssue, CopyMode.WITHOUT_COMMENTS);

        assertEquals("ElsoIssue", thirdIssue.getName());
        assertEquals(Status.NEW, thirdIssue.getStatus());
        assertEquals(0, thirdIssue.getComments().size());
    }
}