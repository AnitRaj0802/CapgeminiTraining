package JsonHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteData {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Trainer trainer = new Trainer("abc",10);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ID", 101);
		map.put("Name", "Dinga");
		map.put("Percentage", 98.98);
//		String[] subjects = {"English","Science","Maths"};
		List<String> subjects = Arrays.asList("English","Science","Maths");
		map.put("subjects", subjects);
		List<Object> tc = Arrays.asList(trainer);
		map.put("trainer", tc);
		FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JsonHandling\\src\\main\\java\\JsonHandling\\Student.json");
		objectMapper.writeValue( fw,map);
		System.out.println("data written");
		
	}
}
