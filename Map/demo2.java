package Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class demo2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
//		h.put(null, null);
		h.put(1, "Anit");
		h.put(2, "Abhi");
		h.put(3, "aritra");
		h.put(4, "rajat");
		System.out.println(h);
		System.out.println(h.reversed());
		Set<Integer> key_set = h.keySet();
		for(int key:key_set) {
			System.out.println(key+"\t"+h.get(key));
		}
	}
}
