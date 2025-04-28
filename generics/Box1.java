package generics;

//public class Box1<T>{
//	T num1;
//	T num2;
//	
//	Box1(T num1,T num2){
//		this.num1=num1;
//		this.num2=num2;
//	}
//	public void add(T num1,T num2) {
////		System.out.println(num1+num2);
//	}
//	public static void main(String[] args) {
//		Box1<Integer> b1 = new Box1<Integer>(10,20);
//		System.out.println(b1.num1+b1.num2);
//		
//	}
//}
	public class Box1<T extends Number>{
		T value;
		Box1(T value){
			this.value=value;
		}
		public static void main(String[] args) {
			Box1<Integer> b1=new Box1<>(10);
			Box1<?> b2 = b1;
			Box1<? extends Object> b3=b1;
			Box1<? super Integer> b4=b1;

		}
	}
