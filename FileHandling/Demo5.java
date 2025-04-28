package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\User\\Documents\\test\\Demo1\\FirstFile.txt");
		BufferedReader bf = new BufferedReader(f);
		String line = bf.readLine();
		while(line != null) {
			System.out.println(line);
			line=bf.readLine();
		}
	}
}
