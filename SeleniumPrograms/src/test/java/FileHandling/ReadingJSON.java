package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJSON {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		
		String path =System.getProperty("user.dir")+"//src//test//resources//test.json";
		FileReader reader = new FileReader(path);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(reader);
		
		System.out.println(json.toJSONString());
	
		
		JSONArray testData =(JSONArray)json.get("testdata");
		
		for(int i=0;i<testData.size();i++) {
			JSONObject testDetails =(JSONObject) testData.get(i);
			String testName = (String)testDetails.get("testName");
			System.out.println(testName);
			JSONArray data = (JSONArray)  testDetails.get("data");
			System.out.println(data.size());
			for(int j=0;j<data.size();j++) {
				JSONObject currentTestData = (JSONObject)data.get(j);
				Set<String> keys = 	currentTestData.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key=it.next();
					String value=(String)currentTestData.get(key);
					System.out.println(key +" --- "+value);
				}
			}
		}
		
	}
}
