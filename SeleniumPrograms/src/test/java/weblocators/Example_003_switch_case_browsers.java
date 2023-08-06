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
			
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			break;
		}
		case "FireFox":
			
		{
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			break;

		}
		case "MicrosoftEdge":{
			
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
