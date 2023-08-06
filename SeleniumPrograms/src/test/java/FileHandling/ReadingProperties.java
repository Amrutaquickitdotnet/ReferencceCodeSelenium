package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
	
	public static void main(String arg[]) throws IOException {
		
		
		System.out.println(System.getProperty("user.dir"));
				
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));

		
		
	}

}
