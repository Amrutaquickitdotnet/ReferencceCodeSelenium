package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_028_checkvalidationmessgaeforpassword {
	static WebDriver driver;
	public static void main(String[] args) {
		// check validation message
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\ReferenceCode\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		checkPwdMessage(driver);
		//driver.quit();
		
	}
	
	public static void checkPwdMessage(WebDriver driver)
	{
		WebElement e = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		e.sendKeys("admin");
	
		e = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		e.click();
	
		e = driver.findElement(By.xpath("//*[@id='spanMessage']"));
		String title = e.getText();
		if(title.equals("Password cannot be empty"))
		{
			System.out.println("Validation appeared  for password ");
		}else{
			System.out.println("Error: Sorry validation does not match");
		}
		
		
	}

}
