package radiobuttosandScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Radio_isdisabled{
	static WebDriver driver;
	public static void main(String[] args) {
		radio();

	}
	
	
	
	public static void radio() {

		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.quickitdotnet.co.in/practice-project");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		// As we can see, all the radio buttons are being created using the HTML tag <input> and have an attribute named "type", 
		//which has a value "radio", which signifies that the type of the input element is a radio button.

	     //Now, let's see how we can locate and perform specific actions on the Radion Buttons using Selenium WebDriver?
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  WebElement otherradio = driver.findElement(By.cssSelector("#radio2"));

		//verify the button's disabled property

		if (otherradio.isEnabled()) {
			System.out.println("Other button is enabled");
	
	
		}else {
			System.out.println("Other button is disabled");
		}
		

}
}