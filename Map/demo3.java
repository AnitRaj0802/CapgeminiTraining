package Map;

import java.util.TreeMap;

public class demo3 {
	public static void main(String[] args) {
		TreeMap<Integer, Character> h = new TreeMap<Integer, Character>();
		h.put(1, 'A');
		h.put(2, 'N');
		h.put(3, 'I');
		h.put(4, 'T');
		System.out.println(h.get(2));
		System.out.println(h);
	}
}
