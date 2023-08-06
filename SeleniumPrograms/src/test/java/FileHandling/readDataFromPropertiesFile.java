package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class readDataFromPropertiesFile {

	//FileReader=> Reading file but in format of json , xml
	//FileWriter=> File Write but in format json, xml
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir")+"//src//test//resources//login.properties";
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(p.getProperty("Username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
