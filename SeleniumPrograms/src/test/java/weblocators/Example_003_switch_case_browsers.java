package weblocators;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example_003_switch_case_browsers {
 static WebDriver driver;
	public static void main(String[] args)// Static method
	{
		
		Scanner  s = new Scanner(System.in);
		System.out.println("Please choose option");
		String browser =s.next();
		switch (browser) {
		case "chrome": {
			System.setProperty("webdriver.chrome.driver", "D:\\JarFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			break;
		}
		case "FireFox":
			
		{
			System.setProperty("webdriver.gecko.driver", "D:\\JarFiles\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			break;

		}
		case "MicrosoftEdge":{
			System.setProperty("webdriver.edge.driver", "D:\\JarFiles\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			break;
			
		}
		default:
			
			System.out.println("sorry you have entered invalid browser name");
		}
		s.close();// Thread -safe
	}
}
