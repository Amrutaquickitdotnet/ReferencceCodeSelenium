package weblocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Example_015_Google {
	static WebDriver driver;

	

	public static void main(String[] args)// Static method
	{
testApp();
	}
	public static void testApp() {
		String selection = "hello";
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(selection);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));

		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']"));
		System.out.println("Size - " + options.size());
		for (WebElement e : options) {
			System.out.println(e.getText());
			System.out.println("********************");
			
			 
		}

	}

}
