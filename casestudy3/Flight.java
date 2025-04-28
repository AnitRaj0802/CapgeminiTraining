package casestudy3;

public class Flight {
	private String flightID;
	private String departureTime;
	private String arrivalTime;
	private int availableSeats;
	public Flight(String flightID, String departureTime, String arrivalTime, int availableSeats) {
        this.flightID = flightID;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
    }
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
    public boolean isAvailable(int numberOfSeats) {
        return availableSeats >= numberOfSeats;
    }
    public boolean bookSeats(int numberOfSeats) {
        if (isAvailable(numberOfSeats)) {
            availableSeats -= numberOfSeats;
            return true;
        }
        return false;
    }
    public String getFlightInfo() {
        return "Flight ID: " + flightID + 
               ", Departure: " + departureTime + 
               ", Arrival: " +  arrivalTime +
               ", Available Seats: " + availableSeats;
    }
}
