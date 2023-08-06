package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisplayAllLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		  driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		login(driver);
		getAllLinks(driver);
	
	}
	
	public static void getAllLinks(WebDriver driver)
	{
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for(WebElement getlink : Links)
		{
		System.out.println(getlink.getAttribute("href"));	
		}
		
	}
	
	public static void login(WebDriver driver)
	{
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();
	  
		
	}
	



	}


