package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("Nagy Sándor", 25_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger(
                "Kis Mari", 25_000, 30);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger(
                "Piros Alma", 25_000, 30);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}