package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1, "Anit");
		h.put(2, "Abhi");
		h.put(3, "aritra");
		h.put(4, "rajat");
		
//		h.put(null, "hello");
//		System.out.println(h.getOrDefault(100, null));
//		Set<Entry<Integer,String>> entry_set = h.entrySet();
//		for(Map.Entry<Integer, String> entry:entry_set) {
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
		
		Set<Integer> key_set = h.keySet();
		for(int key:key_set) {
			System.out.println(key+"\t"+h.get(key));
		}
		System.out.println(h);
	}
}
