package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program to illustrate webelement by "ID"
public class Example_004_WebElement_Byid 
{
	
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

		System.setProperty("webdriver.chrome.driver", "D:\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		// there are 2 method to get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 * driver.navigate().to("https://www.amazon.co.in"); driver.navigate().back();
		 * driver.navigate().refresh(); driver.navigate().forward();
		 */
		driver.manage().window().maximize();
		// to send value inside username field
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		// to send value inside password field
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

	}
};
