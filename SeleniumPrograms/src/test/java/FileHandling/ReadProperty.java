package FileHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ReadProperty {
	
	static FileInputStream fs;
	static Properties prop ;
	static WebDriver driver;
	 
  public static void main(String[] args) throws FileNotFoundException  
  {
	  readdata();
	  
  }
  public static void readdata() throws FileNotFoundException 
  {
	  String file = "D:\\SeleniumCode\\utility\\config.properties";
	  fs = new FileInputStream(file);
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 prop = new Properties();
		
		//load properties file
		try {
			prop.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.id("btnLogin")).click();
		
		
		System.out.println("URL ::" + prop.getProperty("URL"));
		System.out.println("Username::" +prop.getProperty("Username"));
	    System.out.println("Password::" +prop.getProperty("Password"));
  }
}
