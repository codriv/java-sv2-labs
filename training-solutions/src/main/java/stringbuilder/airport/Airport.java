package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    public static void main(String[] args) {
        Flight flight1 = new Flight("B-2351", Status.ACTIVE);
        Flight flight2 = new Flight("N-312561", Status.ACTIVE);
        Flight flight3 = new Flight("S-35", Status.DELETED);
        Flight flight4 = new Flight("C-2181", Status.ACTIVE);
        Flight flight5 = new Flight("K-351", Status.DELETED);
        Flight flight6 = new Flight("Y-102", Status.DELETED);
        Flight flight7 = new Flight("M-45", Status.ACTIVE);

        Airport airport = new Airport();

        airport.flights.add(flight1);
        airport.flights.add(flight2);
        airport.flights.add(flight3);
        airport.flights.add(flight4);
        airport.flights.add(flight5);
        airport.flights.add(flight6);
        airport.flights.add(flight7);

        System.out.println(airport.getDeletedFlights());
        System.out.println();

        flight1.setStatus(Status.DELETED);
        flight4.setStatus(Status.DELETED);
        flight7.setStatus(Status.DELETED);

        System.out.println(airport.getDeletedFlights());
    }

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){}

    public StringBuilder getDeletedFlights() {
        StringBuilder deletedFlights = new StringBuilder("Törölt járatok:");
        for (Flight flight: flights) {
            if (flight.getStatus() == Status.DELETED) {
                deletedFlights.append("\n");
                deletedFlights.append(flight.getFlightNumber());    // deletedFlights.append("\n" + flight.getFlightNumber());
            }
        }
        return deletedFlights;
    }
}
