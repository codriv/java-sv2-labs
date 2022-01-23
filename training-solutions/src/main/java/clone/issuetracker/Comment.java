package clone.issuetracker;

import java.time.LocalDateTime;

public class Comment {

    private String text;
    LocalDateTime time;

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    public Comment(Comment newComment) {
        this.text = newComment.text;
        this.time = newComment.time;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setText(String text) {
        this.text = text;
    }
}
