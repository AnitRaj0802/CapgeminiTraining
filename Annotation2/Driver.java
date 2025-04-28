package Annotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter role");
		String role=sc.next();
		System.out.println("Enter the method that u want to call");
		String method_name = sc.next();
		Task task = new Task();
		userValidCheck(role, method_name, task);
	}
	public static void userValidCheck(String roleByUser,String method_name,Task t) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Class<Task> c = Task.class;
		Method m =c.getMethod(method_name);
		if(m.isAnnotationPresent(Role.class)) {
			Role role = m.getAnnotation(Role.class);
			if(role.value().equals(roleByUser)) {
				m.invoke(t);
			}else {
				System.out.println("Role not valid.Dont have access");
			}
//			System.out.println(role);
//			System.out.println(role.value());
		}
	}
}
