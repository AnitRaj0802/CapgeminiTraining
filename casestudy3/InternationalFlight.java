package casestudy3;

public class InternationalFlight extends Flight{
	private String countryCode;

    public InternationalFlight(String flightID, String departureTime, String arrivalTime, 
                          int availableSeats, String countryCode) {
        super(flightID,departureTime,arrivalTime,availableSeats);
        this.countryCode = countryCode;
    }

    @Override
    public String getFlightInfo() {
        return super.getFlightInfo() + ", State Code: " + countryCode;
    }

    public String getStateCode() {
        return countryCode;
    }
}

