package weblocators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_026_logout {
	static WebDriver driver;

	public static void main(String[] args) {
		
	
		
		
		login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		logout();
	
	}
	
	
	
	public static void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\ReferenceCode\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();  
		
	}
	
	
	
	public static void logout()
	{
		WebElement e = driver.findElement(By.xpath("//*[@id='welcome']"));
		e.click();
		
		 e = driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a"));
		e.click();
	}
}
