package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable busTimeTable = new BusTimeTable(5, 22, 20);

    @Test
    void getTimeTable() {
        System.out.println(busTimeTable.getTimeTable());
    }

    @Test
    void getNextBus() {
        System.out.println(busTimeTable.getNextBus(new SimpleTime(12, 40)));
    }
}