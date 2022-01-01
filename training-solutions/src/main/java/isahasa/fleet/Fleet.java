package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        waitingPeople = passengers;
        waitingCargo = cargoWeight;
        for (Ship ship: ships) {
            if (ship instanceof CanCarryPassengers && ship instanceof CanCarryGoods) {
                waitingPeople = ((FerryBoat) ship).loadPassenger(waitingPeople);
                waitingCargo = ((FerryBoat) ship).loadCargo(waitingCargo);
            } else if (ship instanceof CanCarryPassengers) {
                waitingPeople = ((Liner) ship).loadPassenger(waitingPeople);
            } else if (ship instanceof CanCarryGoods) {
                waitingCargo = ((CargoShip) ship).loadCargo(waitingCargo);
            }
        }
    }
}
