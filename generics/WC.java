package generics;

public class WC {
	public static void printBox(Box<?> box) {
		Object value = box.getValue();
		System.out.println(value);
	}
	public static void main(String[] args) {
		Box<Object> b1=new Box<>(10);
		Box<Object> b2=new Box<>(10.0);
		Box<Object> b3=new Box<>("hello");
		
		printBox(b1);
		printBox(b2);
		printBox(b3);
	}
}