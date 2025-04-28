package StreamAPI;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
//import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		List<String> newList = Arrays.asList("apple","banana","are","city","kiwi","guava","mango","kites");
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list.add(10);
//		list.add(23);
//		list.add(30);
//		list.add(45);
//		ListIterator<Integer> itr = list.listIterator();
//		while(itr.hasNext()) {
//			int val=itr.next();
//			if(val%2==0) {
//				list2.add(val);
//			}
//		}
//		for(Integer i:list) {
//			if(i%2==0) {
//				list2.add(i);
//			}
//		}
//		System.out.println(list2);
		List<Integer> list2= list.stream().filter(i -> i%2==0).toList();
		System.out.println(list2);
		List<Integer> list3 = list.stream().map(i-> i*2).toList();
		System.out.println(list3);
		List<Integer> list4 = list.stream().skip(2).toList(); //toList-> terminal operation
		System.out.println(list4);
		List<Integer> list5 = list.stream().limit(2).skip(1).toList();
		System.out.println(list5);
		List<Integer> list6 =list.stream().sorted().toList();
		System.out.println(list6);
		List<Integer> list7 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list7);
		List<Integer> list8 = list.stream().sorted().distinct().toList();
		System.out.println(list8);
		List<String> list9 = newList.stream().filter(s-> s.charAt(0)=='a').toList();
		System.out.println(list9);
		List<String> list10 = newList.stream().filter(s-> s.length()>3).toList();
		System.out.println(list10);
		List<String> list11= newList.stream().filter(s->s.charAt(s.length()-1)=='y').toList();
		System.out.println(list11);
		System.out.println(list.stream().map(n-> n+"hi").toList());
		int min = list.stream().min(Integer::compare).get();
		int max = list.stream().max(Integer::compare).get();
		System.out.println(min+" "+max);
		int first = list.stream().findFirst().get();
		System.out.println(first);
		Map<Integer,List<String>>map=newList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		Map<Object, Long> map2 = newList.stream().collect(Collectors.groupingBy(s-> s.charAt(0),Collectors.counting()));
		System.out.println(map2);
	}
}
