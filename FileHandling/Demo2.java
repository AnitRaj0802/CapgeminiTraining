package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\User\\Documents\\test\\Demo1\\FirstFile.txt");
		f.write("hi\n");
		f.write('a'+"\n");
		f.write(99);
		f.flush();
		System.out.println("Data Written");
	}
}
