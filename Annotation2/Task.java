package Annotation2;

public class Task {
	@Role("user")
	public void userTask() {
		System.out.println("User Role");
	}
	@Role("admin")
	public void adminTask() {
		System.out.println("Admin Role");
	}
}
