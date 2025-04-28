package generics;

public class Box<T> {
	private T value;
	Box(T value) {
		this.value=value;
	}
	T getValue() {
		return this.value;
	}
}
