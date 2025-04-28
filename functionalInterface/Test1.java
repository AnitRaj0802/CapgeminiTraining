package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,6,3,5,4,2);
//		Collections.sort(list,(n1,n2) -> n1-n2);
		Collections.sort(list,Integer::compareTo);
		list.forEach(System.out::print);
		
		Integer[] arr = list.toArray(Integer[]::new);
//		System.out.println(Arrays.toString(arr));
	}
}
