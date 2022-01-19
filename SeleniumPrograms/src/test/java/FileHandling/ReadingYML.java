package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
// Map - JSONObject
// List - JSONArray
public class ReadingYML {
//https://mvnrepository.com/artifact/com.esotericsoftware.yamlbeans/yamlbeans/1.14
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws FileNotFoundException, YamlException {
		String path =System.getProperty("user.dir")+"\\src\\test\\resources\\test.yml";
		YamlReader reader = new YamlReader(new FileReader(path));
		Map map = (Map)reader.read();
		
		System.out.println(map);
		List datasets = (List)map.get("testdata");
		System.out.println(datasets);
		Map dataSet = (Map)datasets.get(0);
		System.out.println(dataSet);
		String name = (String)dataSet.get("testname");
		System.out.println(name);
		List data = (List)dataSet.get("data");
		Map currentData = (Map)data.get(1);
		System.out.println(currentData.get("browser"));
	}

}
