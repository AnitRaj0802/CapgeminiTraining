package Lamda;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Double> list2 = Arrays.asList(1.0,2.0,3.0,4.0,5.0);
		List<String> list = Arrays.asList("App","Bana","Cherry");
		Collections.sort(list,(s2,s1)->s2.compareTo(s1));
//		Collections.sort(list,(s2,s1)->s1.length()-s2.length());
		Collections.sort(list2,(d1,d2)->Double.compare(d2, d1));
		list2.forEach(s->System.out.println(s));
	}
	
}
