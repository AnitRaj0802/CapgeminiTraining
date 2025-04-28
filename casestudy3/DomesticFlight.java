package casestudy3;

public class DomesticFlight extends Flight{
	private String stateCode;

    public DomesticFlight(String flightID, String departureTime, String arrivalTime, 
                          int availableSeats, String stateCode) {
        super(flightID,departureTime,arrivalTime,availableSeats);
        this.stateCode = stateCode;
    }

    @Override
    public String getFlightInfo() {
        return super.getFlightInfo() + ", State Code: " + stateCode;
    }

    public String getStateCode() {
        return stateCode;
    }
}
