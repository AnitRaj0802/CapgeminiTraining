package generics;

public class Shape<K extends Number,V> {
	private K key;
	private V value;
	Shape(K key,V value){
		this.key=key;
		this.value=value;
	}
	K getKey() {
		return key;
	}
	V getValue() {
		return value;
	}
}