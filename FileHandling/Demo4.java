package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\User\\Documents\\test\\Demo1\\FirstFile.txt");
		BufferedWriter b = new BufferedWriter(f);
		b.write("hi");
		b.newLine();
		b.write(200);
		b.newLine();
		b.write('z');
		b.flush();
		System.out.println("Data written");
	}
}
