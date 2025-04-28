package Reflection;

import java.lang.reflect.Method;

public class Driver2 {
	public static void main(String[] args) {
		Class<Person> c= Person.class;
		Method[] methodList = c.getMethods();
//		for(Method methods : methodList) {
//			System.out.println(methods);
//		}
		
		//of same class
		Method[] mL2 = c.getDeclaredMethods();
//		for(Method methods : mL2) {
//			System.out.println(methods);
//		}
		//of parent class
		Class<Object> c2=(Class<Object>)c.getSuperclass();
		Method[] ml3 = c2.getDeclaredMethods();
		for(Method method: ml3) {
			System.out.println(method);
		}
	}
}
