package methodpass.window;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    List<Window> windows = new ArrayList<>();

    @BeforeEach
    void fillList() {
        windows.add(new Window("nappali", 120, 150));
        windows.add(new Window("hálószoba", 90, 150));
        windows.add(new Window("konyha", 90, 150));
        windows.add(new Window("fürdőszoba", 60, 60));
    }

    WindowOperation windowOperation = new WindowOperation();

    @Test
    void testRiseSize() {
        windowOperation.riseSize(windows, 30);
        assertEquals(180, windows.get(1).getHeight());
        assertEquals(90, windows.get(3).getHeight());
    }

    @Test
    void testRiseSizeWithNewWindow() {
        windowOperation.riseSizeWithNewWindow(windows, 30);
        assertEquals(180, windows.get(1).getHeight());
        assertEquals(90, windows.get(3).getHeight());
    }
}