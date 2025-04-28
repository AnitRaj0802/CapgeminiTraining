package generics;

import java.util.LinkedList;

public class WildCards2 {
	//unbounded wild cards
	public static<T> void printLinkedList(LinkedList<? super Integer> list) {
		list.add(10);
		for(Object obj:list) {
			System.out.println(obj+"\t");
		}
//		Object i = list.get(0);//data returned as Object type
//		int i = (int) list.get(0);//data returned as Object type
		Integer i = (Integer)list.get(0);
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		printLinkedList(list);

	}
}
