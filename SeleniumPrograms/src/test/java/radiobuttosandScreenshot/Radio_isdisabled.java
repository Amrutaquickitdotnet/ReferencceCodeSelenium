package radiobuttosandScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radio_isdisabled {
	static WebDriver driver;

	public static void main(String[] args) {
		radio();

	}

	public static void radio() {

		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement secondRadioButton = driver.findElement(By.xpath("//input[@value='2']"));

		System.out.println(secondRadioButton.isEnabled());

		if (secondRadioButton.isEnabled()) {
		  System.out.println("Other button is enabled");
		secondRadioButton.click();
		 }
		else 
		{
			secondRadioButton.click();
			System.out.println("Other button is disabled"); }
		 
	}
}