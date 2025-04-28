package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//To get Class object
		Class<Person> c = Person.class;
		System.out.println(c.getPackageName());
		
		//get all constructors
		Constructor<?>[] cons = c.getDeclaredConstructors();
		for(Constructor<?> constructor:cons) {
			System.out.println(constructor);
		}
		System.out.println();
		
		
		//getting specified constructor
		Constructor<Person> con1 = c.getDeclaredConstructor();
		System.out.println(con1);
		con1.setAccessible(true);
		Person p = con1.newInstance();
		System.out.println(p);
		
		
		System.out.println();
		
		
		Constructor<Person> con2 = c.getDeclaredConstructor(String.class,int.class);
		System.out.println(con2);
		con2.setAccessible(true);
		Person p2 = con2.newInstance("anit",30);
		System.out.println(p2);
		
		
		
//		Class<Person> c2=(Class<Person>) new Person("anit",22).getClass();
//		Class<Person> c3 = (Class<Person>) Class.forName("Reflection.Person");
		
	}
}
