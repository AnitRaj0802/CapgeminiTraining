package Map;



import java.util.HashMap;
import java.util.Map;

public class demo4 {
	
	public static void main(String[] args) {
		
		Actor a1 = new Actor("Johhny Depp", 58);
		Actor a2 = new Actor("Madhuri Dixit", 54);
		Actor a3 = new Actor("Will Smith", 53);
		Actor a4 = new Actor("Shah Rukh Khan", 55);
		
		Map<Actor, String> map = new HashMap<Actor, String>();
		map.put(a1, "Hollywood");
		map.put(a2, "Bollywood");
		map.put(a3, "Hollywood");
		map.put(a4, "Bollywood");
		
		String industry = map.get(a3);
		System.out.println(map);
		System.out.println(a3 + " belongs to " + industry);
	}

}
