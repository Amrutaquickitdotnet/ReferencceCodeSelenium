package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_004_WebElement_Byid 
{
	
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

		
		driver = new ChromeDriver();

		// there are 2 method to get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='username')"));
		username.sendKeys("Admin");

		// to send value inside password field
		WebElement password = driver.findElement(By.id("//input[@type='password'"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("//button[@type='submit'"));
		loginBtn.click();

	}
};
