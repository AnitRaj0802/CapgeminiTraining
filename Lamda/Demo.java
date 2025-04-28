package Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list2 = List.of(1,2,3,4,5);
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Collections.sort(list,(n1,n2)->n2-n1);
//		list.forEach(t->System.out.print(t+" "));
		System.out.println();
		System.out.println(list);
	}
}
