package JsonHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadData {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper  = new ObjectMapper();
		FileReader fileReader = new FileReader("C:\\Users\\User\\eclipse-workspace\\JsonHandling\\src\\main\\java\\JsonHandling\\Student.json");
		Map<String,Object>map = objectMapper.readValue(fileReader, Map.class);
		for(String string:map.keySet()) {
			System.out.println(string+"\t"+map.get(string));
		}
	}
}
