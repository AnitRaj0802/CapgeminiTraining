package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","are","city","kiwi","guava","mango","kites");
		List<String>res=list.stream().map(s-> s.toUpperCase()).toList();
		System.out.println(res);
		String res2 = list.stream().filter(s-> s.charAt(0)=='a').findFirst().get();
		System.out.println(res2);
	}
}
