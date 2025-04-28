package casestudy3;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<Flight> flightList;

    public FlightList() {
        this.flightList = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public boolean bookFlight(String flightId, int count) {
        for (Flight flight : flightList) {
            if (flight.getFlightID().equals(flightId)) {
                return flight.bookSeats(count);
            }
        }
        return false;
    }
    public List<Flight> getAvailableFlights(String start, String end) {
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getDepartureTime().compareTo(start) >= 0 && 
                flight.getArrivalTime().compareTo(end) <= 0 && 
                flight.getAvailableSeats() > 0) {
                availableFlights.add(flight);
            }
        }
        return availableFlights;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

}
