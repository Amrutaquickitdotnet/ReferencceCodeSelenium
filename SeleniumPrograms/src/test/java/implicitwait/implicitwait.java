package implicitwait;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class implicitwait {
	static WebDriver driver;

	public static void main(String[] args) {
		
		login();
	
	}

	public static void login()
	{
	
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
}	

	


