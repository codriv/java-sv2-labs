package sorting;

import java.time.LocalTime;

public class Patient {

    private String name;
    private String Taj;
    private LocalTime time;

    public Patient(String name, String taj, LocalTime time) {
        this.name = name;
        Taj = taj;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTaj() {
        return Taj;
    }

    public LocalTime getTime() {
        return time;
    }
}