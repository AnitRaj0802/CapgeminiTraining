package JsonHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteObject {
	public static void main(String[] args) throws IOException {
		Trainer trainer = new Trainer("Anit",10);
		ObjectMapper objectMapper = new ObjectMapper();
		FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JsonHandling\\src\\main\\java\\JsonHandling\\Student2.json");
		objectMapper.writeValue(fw, trainer);
		System.out.println("data entered");
		FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\JsonHandling\\src\\main\\java\\JsonHandling\\Student2.json");
		Trainer t = objectMapper.readValue(fr, Trainer.class);
		System.out.println(t.getName()+"\t"+t.getExperience());
	}
}
