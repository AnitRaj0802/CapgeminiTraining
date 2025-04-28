package functionalInterface;

public class Driver {
	public static void main(String[] args) {
//		Operation o = new Calci()::add;
//		int result = o.operate(10, 20);
//		System.out.println(result);
		Operation o = Calci::new;
		o.operate();
		
	}
}
