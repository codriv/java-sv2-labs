package collectionsiterator;

import java.time.LocalDateTime;
import java.util.*;

public class HomeSchooling {

    private Set<OnlineLesson> lessons = new TreeSet<>();

    public Set<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        lessons.add(lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> selectedLessons = new ArrayList<>();
        for (OnlineLesson lesson: lessons) {
            if (title.equals(lesson.getSubject())) {
                selectedLessons.add(lesson);
            }
        }
        Collections.sort(selectedLessons);
        return selectedLessons;
    }

    public void removeLesson (LocalDateTime startTime) {
        for (Iterator<OnlineLesson> iterator = lessons.iterator(); iterator.hasNext();) {
            OnlineLesson next = iterator.next();
            if (startTime.isEqual(next.getStartTime())) {
                iterator.remove();
            }
        }
    }
}
