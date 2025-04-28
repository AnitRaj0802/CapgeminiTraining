package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\User\\Documents\\test\\Demo1\\FirstFile.txt");
		int i = f.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=f.read();
		}
	}
}
