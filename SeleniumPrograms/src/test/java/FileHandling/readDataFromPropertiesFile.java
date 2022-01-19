package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readDataFromPropertiesFile {
// java.lang String , Array ,all dataTypes
	//java.util List . Set , Hashtable 
	// java.awt => Grphical , Hibernate +j2EE applets a = new applets a.draw(0, 20)___
	//java.io => Very imp selenium , File Read, Write , File xls read , write 
	//FileInputStream Class=> I want to read any xls, doc 
	// FileOutputStream=> Write Fileoutput
	//FileReader=> Reading file but in format of json , xml
	//FileWriter=> File Write but in format json, xml
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String path ="D:\\Amruta\\ReferenceCode\\ReferenceCode\\src\\test\\java\\com\\utility\\login.properties";
		// This example will give you idea about File handling with properties 
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		
		
		Properties p = new Properties();
		try {
			p.load(fs);
			System.out.println("hi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		  driver  = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL"));
		driver.findElement(By.name("txtUsername")).sendKeys(p.getProperty("Username"));
		driver.findElement(By.name("txtPassword")).sendKeys(p.getProperty("Password"));
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		

	}

}
