package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstadingClassName {

	public static void main(String[] args) {
		testApp();
	}

	public static void testApp() {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("abc");

	}

	
}
