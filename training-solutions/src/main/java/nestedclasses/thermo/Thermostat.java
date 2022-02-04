package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<String> roomsToHeat = new ArrayList<>();
    private List<Thermometer> thermometers = new ArrayList<>();
    private int temperatureLimit = 23;

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

    public void addThermometer(Thermometer thermometer) {
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temperatureLimit > temp) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }
}
