package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    LocalDateTime time;
    Status status;
    List<Comment> comments;

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.comments = new ArrayList<>();
    }

    public Issue(Issue newIssue, CopyMode copyMode) {
        this.name = newIssue.name;
        this.time = newIssue.time;
        this.status = newIssue.status;
        setComment(newIssue, copyMode);
    }

    private void setComment(Issue newIssue, CopyMode copyMode) {
        if (copyMode == CopyMode.WITH_COMMENTS) {
            List<Comment> newComments = new ArrayList<>();
            for (Comment comment: newIssue.comments) {
                newComments.add(new Comment(comment));
            }
            this.comments = newComments;
        } else{
            this.comments = new ArrayList<>();
        }
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}