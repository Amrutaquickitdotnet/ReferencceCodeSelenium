package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_006_WebElement_ByXpath {
	
	// Find webElement by "xpath" web locator
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

		
		driver = new ChromeDriver();

		// there are 2 method to get url
		driver.get("http://testphp.vulnweb.com/login.php");
		/*
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 * driver.navigate().to("https://www.amazon.co.in"); driver.navigate().back();
		 * driver.navigate().refresh(); driver.navigate().forward();
		 */
		driver.manage().window().maximize();
		// to send value inside username field
		WebElement username = driver.findElement(By.name("uname"));
		username.sendKeys("test");

		// to send value inside password field
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("test");
		
		
		// click on login button
		
	WebElement loginBtn =	driver.findElement(By.xpath("//input[@value= 'login']"));
	
	loginBtn.click();
		
		

		

	}
};
