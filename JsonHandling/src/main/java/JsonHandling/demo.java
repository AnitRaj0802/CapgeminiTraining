package JsonHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class demo {
	public static void main(String[] args) throws IOException {
		List<Trainer> list = new ArrayList<Trainer>();
		list.add(new Trainer("abc",10));
		list.add(new Trainer("def",10));
		list.add(new Trainer("fhe",10));
		FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JsonHandling\\src\\main\\java\\JsonHandling\\Student3.json");
		ObjectMapper om = new ObjectMapper();
		om.writeValue(fw, list);
		System.out.println("data written");
	}
}
