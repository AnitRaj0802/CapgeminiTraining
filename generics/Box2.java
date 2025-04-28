package generics;

public class Box2 {
	public static <T> void demo(T num1,T num2) {
		System.out.println(num1+" "+num2);
	}
	public static void main(String[] args) {
		demo(10,20);
	}
}
