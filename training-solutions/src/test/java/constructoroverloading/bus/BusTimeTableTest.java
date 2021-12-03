package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable busTimeTable = new BusTimeTable(5, 22, 35);

    @Test
    void getTimeTable() {
        System.out.println(busTimeTable.getTimeTable());
        assertEquals("7:20", busTimeTable.getTimeTable().get(4).toString());
    }

    @Test
    void getNextBus() {
        System.out.println(busTimeTable.getNextBus(new SimpleTime(12, 40)));
        assertEquals("13:10", busTimeTable.getNextBus(new SimpleTime(12, 40)).toString());
    }
}