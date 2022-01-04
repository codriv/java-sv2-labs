package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        this.hour = validateHour(hour);
        this.minute = validateMinute(minute);
    }

    public SimpleTime(String timeString) {
        validateTimeString(timeString);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private int validateHour(int hour) {
        if (0 > hour || hour > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
        return hour;
    }

    private int validateMinute(int minute) {
        if (0 > minute || minute > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
        return minute;
    }

    private void validateTimeString(String timeString) {
        if (timeString == null || timeString.isBlank()) {
            throw new InvalideTimeException("Time is null");
        }
        String[] parts = timeString.split(":");
        if (parts.length == 2) {
            validateFormat(parts);
        } else {
            throw new InvalideTimeException("Time is not hh:mm");
        }
    }

    private void validateFormat(String[] parts) {
        try {
            this.hour = validateHour(Integer.parseInt(parts[0]));
            this.minute = validateMinute(Integer.parseInt(parts[1]));
        } catch (NumberFormatException nfe) {
            throw new InvalideTimeException("Time is not hh:mm", nfe);
        }
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}
