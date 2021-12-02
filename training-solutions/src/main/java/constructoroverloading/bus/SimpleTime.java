package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;
    private SimpleTime simpleTime;

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(SimpleTime simpleTime) {
        this.simpleTime = simpleTime;
    }

    public int getDifference(SimpleTime time) {
        int thisMinutes = (hours * 60) + minutes;
        int anotherMinutes = (time.hours * 60) + time.minutes;
        return thisMinutes - anotherMinutes;
    }

    public String toString() {
        return hours + ":" + (minutes < 10 ? "0" : "") + minutes;
    }
}
