package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_012_WebElement_ByXpath_using_orandand {

	// Find webElement by "OR and AND" web locator
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

		System.setProperty("webdriver.chrome.driver", "D:\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://testphp.vulnweb.com/login.php");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//*[@type='text' and @name='uname']")).sendKeys("test");
		
		driver.findElement(By.xpath("//*[@type='password' or @name ='pass']")).sendKeys("test");
	}
}