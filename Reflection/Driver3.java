package Reflection;

import java.lang.reflect.Method;

public class Driver3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Person> c = Person.class;
		Method m1=c.getDeclaredMethod("getDetails");
		m1.setAccessible(true);
		m1.invoke((String)new Person());
	}
}
