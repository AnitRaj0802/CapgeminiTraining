package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\User\\Documents\\test\\Demo1");
//		boolean b = f.createNewFile(); 
//		System.out.println(b);
		String[] list = f.list();
		System.out.println(Arrays.toString(list));
		
	}
}
