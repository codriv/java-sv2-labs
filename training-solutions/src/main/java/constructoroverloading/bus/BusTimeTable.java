package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = new ArrayList<>();
        int hour = firstHour;
        for (int i = 0; (hour * 60 + i <= (lastHour + 1) * 60); i += everyMinute) {
            if (i > 59) {
                hour++;
                i -= 60;
            }
            timeTable.add(new SimpleTime(hour, i));
        }
    }

//    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
//        timeTable = new ArrayList<>();
//        for (int i = firstHour; i <= lastHour; i++) {
//            for (int j = 0; j < 60; j += everyMinute) {
//                timeTable.add(new SimpleTime(i, j));
//            }
//        }
//    }


    public SimpleTime getNextBus(SimpleTime actual) {
        for (SimpleTime simpleTime: timeTable) {
            if (simpleTime.getDifference(actual) > 0) {
                return simpleTime;
            }
        }
        throw new IllegalStateException("No more Bus today!");
    }
}
