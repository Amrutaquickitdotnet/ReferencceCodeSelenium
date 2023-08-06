package weblocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_008_WebElement_ByTagName {

	// Find webElement by "Tagname" web locator
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

		
		driver = new ChromeDriver();

		
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		List<WebElement> myList =	driver.findElements(By.tagName("a"));
		System.out.println("Count of links"+myList.size());
		
		
		for(WebElement ourList:myList) 
		{
			System.out.println(ourList.getText());
		}
		
	}
};
