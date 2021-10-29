package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance_2 {

    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance_2(String date, String artist, String startTime, String endTime) {
        this.date = LocalDate.parse(date);
        this.artist = artist;
        this.startTime = LocalTime.parse(startTime);
        this.endTime = LocalTime.parse(endTime);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        String info = artist + ": " + date +
                " " + startTime + " - " + endTime;
        return info;
    }
}