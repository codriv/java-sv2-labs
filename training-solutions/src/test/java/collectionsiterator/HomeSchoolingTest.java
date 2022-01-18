package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling hs = new HomeSchooling();

    @BeforeEach
    void fill() {
        hs.addNewLesson(new OnlineLesson("Nagy Sándor", "fizika", LocalDateTime.of(2022, 1, 18, 8, 0)));
        hs.addNewLesson(new OnlineLesson("Kis Péter", "matek", LocalDateTime.of(2022, 1, 18, 10, 0)));
        hs.addNewLesson(new OnlineLesson("Széles Margó", "biológia", LocalDateTime.of(2022, 1, 19, 11, 0)));
        hs.addNewLesson(new OnlineLesson("Kemika Lia", "kémia", LocalDateTime.of(2022, 1, 20, 8, 0)));
        hs.addNewLesson(new OnlineLesson("Rombusz Róbert", "matek", LocalDateTime.of(2022, 1, 20, 9, 0)));
    }

    @Test
    void addNewLesson() {
        OnlineLesson newLesson = new OnlineLesson("Zöld Pirosak", "magyar", LocalDateTime.of(2022, 1, 19, 10, 0));
        hs.addNewLesson(newLesson);
        assertEquals(6, hs.getLessons().size());
        assertEquals(true, hs.getLessons().contains(newLesson));
        assertEquals(2, (new ArrayList<>(hs.getLessons())).indexOf(newLesson));
        assertEquals(newLesson, (new ArrayList<>(hs.getLessons())).get(2));
    }

    @Test
    void getLessonsByTitle() {
        assertEquals(2, hs.getLessonsByTitle("matek").size());
        assertEquals("Kis Péter", hs.getLessonsByTitle("matek").get(0).getNameOfTeacher());
    }

    @Test
    void removeLesson() {
        OnlineLesson same = new OnlineLesson("Széles Margó", "biológia", LocalDateTime.of(2022, 1, 19, 11, 0));
        assertEquals(true, hs.getLessons().contains(same));
        hs.removeLesson(LocalDateTime.of(2022, 1, 19, 11, 0));
        assertEquals(false, hs.getLessons().contains(same));
        assertEquals(4, hs.getLessons().size());
    }
}