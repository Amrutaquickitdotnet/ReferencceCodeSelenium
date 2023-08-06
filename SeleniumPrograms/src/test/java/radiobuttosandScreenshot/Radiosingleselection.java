package radiobuttosandScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiosingleselection {
	static WebDriver driver;

	public static void main(String[] args) {

		radio();

	}

	public static void radio() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quickitdotnet.co.in/practice-project");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		// As we can see, all the radio buttons are being created using the HTML tag
		// <input> and have an attribute named "type",
		// which has a value "radio", which signifies that the type of the input element
		// is a radio button.

		// Now, let's see how we can locate and perform specific actions on the Radion
		// Buttons using Selenium WebDriver?
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement radioElement = driver.findElement(By.id("radio2"));

		radioElement.click();
	}
}
