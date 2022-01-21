package cssSelectors;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnderstadingClassName {

	public static void main(String[] args) {
		testApp();
	}

	public static void testApp() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("abc");

	}

}
