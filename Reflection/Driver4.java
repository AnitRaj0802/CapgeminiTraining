package Reflection;

import java.lang.reflect.Field;

public class Driver4 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c = Person.class;
		//get all varaibles
		Field[] f = c.getDeclaredFields(); 
		for(Field field:f) {
			System.out.println(field);
		}
		//get specified var
		Field f2 = c.getDeclaredField("age");
		System.out.println(f2);
	}
}
