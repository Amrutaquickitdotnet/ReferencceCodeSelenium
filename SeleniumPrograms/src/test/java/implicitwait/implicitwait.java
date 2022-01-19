package implicitwait;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class implicitwait {
	static WebDriver driver;

	public static void main(String[] args) {
		
		login();
	
	}

	public static void login()
	{
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		e.clear();
		
	}
	
}	

	


