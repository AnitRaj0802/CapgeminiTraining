package generics;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape<Double,String> s1= new Shape<>(10.0,"White");
		double key=s1.getKey();
		String value=s1.getValue();
		System.out.println(key + "\t" + value);
	}
}
