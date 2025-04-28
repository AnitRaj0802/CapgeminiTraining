package Reflection;

public class Person {
	
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private Person() {
		System.out.println("no arg cons");
	}
	public String getDetails() {
		return name+"\t+"+age;
	}
	private void task(String task) {
		System.out.println("Task "+ task);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
