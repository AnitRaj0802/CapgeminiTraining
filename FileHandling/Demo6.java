package FileHandling;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\\\Users\\\\User\\\\Documents\\\\test\\\\Demo1\\\\FirstFile.txt");
		pw.println(true);
		pw.println(10.8);
		pw.println("hi");
		pw.println('a');
		pw.println(1000);
		pw.flush();
		System.out.println("data done");
	}
}
