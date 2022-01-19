package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Example_023_AmericanGolf {

	@Test
	public void testApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://americangolf.co.uk");
		driver.manage().window().maximize();
		driver.findElements(By.xpath("//i[@class='icon icon-basket']")).get(1).click();
	}

}
