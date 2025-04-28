package Lamda;

public class Uber {
	public static void main(String[] args) {
		Vehicle car = (a,b) -> {
			return a+b;
		};
		
		Vehicle bike = (a,b)-> a+b;

		System.out.println(car.add(10, 20));
		System.out.println(bike.add(20, 30));
		
	}
}
