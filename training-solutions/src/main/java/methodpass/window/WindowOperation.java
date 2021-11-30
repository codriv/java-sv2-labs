package methodpass.window;

import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {
        for (Window window: windows) {
            window.setHeight(window.getHeight() + plusSize);
        }
    }

    public void riseSizeWithNewWindow(List<Window> windows, int plusSize) {
        for (int i = 0; i < windows.size(); i++) {
            Window window = windows.get(i);
            windows.set(i, new Window(window.getRoomName(), window.getWidth(), (window.getHeight() + plusSize)));
        }
    }
}
