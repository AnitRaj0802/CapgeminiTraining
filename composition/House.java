package composition;

import manytoMany.Room;

public class House {
	private String color;
	private Room room;
	
	public House(String color,double area) {
		this.color=color;
		room = new Room(area);
	}
	public String getColor() {
		return color;
	}
	public Room getRoom() {
		return room;
	}
}
