package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        checkNull(subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        checkNull(subject, tutor);
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    private void checkNull(Subject subject, Tutor tutor) {
        Exceptions.nullPointer((subject == null || tutor == null), "Both subject and tutor must be provided!");
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", markType.getMarkText(), markType.getMark());
    }

    public String toStringFull() {
        return String.format("%s: %s(%d)", subject.getName(), markType.getMarkText(), markType.getMark());
    }
}
