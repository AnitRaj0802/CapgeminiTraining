package demo;

public class PalindromeChecker {
	public String reverse(String str) {
		StringBuilder s = new StringBuilder(str);
		return s.reverse().toString();
	}
	public boolean check(String s) {
		String reverse=reverse(s);
		return s.equals(reverse);
	}
}
