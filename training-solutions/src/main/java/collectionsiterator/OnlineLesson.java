package collectionsiterator;

import java.time.LocalDateTime;
import java.util.Objects;

public class OnlineLesson implements Comparable<OnlineLesson> {

    private String nameOfTeacher;
    private String subject;
    private LocalDateTime startTime;

    public OnlineLesson(String nameOfTeacher, String subject, LocalDateTime startTime) {
        this.nameOfTeacher = nameOfTeacher;
        this.subject = subject;
        this.startTime = startTime;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineLesson that = (OnlineLesson) o;
        return startTime.equals(that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime);
    }

    @Override
    public int compareTo(OnlineLesson other) {
        return startTime.compareTo(other.getStartTime());
    }
}
