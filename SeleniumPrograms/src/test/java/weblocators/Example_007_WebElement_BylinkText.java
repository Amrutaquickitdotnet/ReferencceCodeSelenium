package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_007_WebElement_BylinkText {

	// Find webElement by "linkText" web locator
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{

	
		driver = new ChromeDriver();

		// <a href="/index.php/auth/requestPasswordResetCode">Forgot your password?</a>
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.findElement(By.linkText("Forgot your password?")).click();
		WebElement link = driver.findElement(By.linkText("Forgot your password?"));
		link.click();// variable name+methodname

	}
};
