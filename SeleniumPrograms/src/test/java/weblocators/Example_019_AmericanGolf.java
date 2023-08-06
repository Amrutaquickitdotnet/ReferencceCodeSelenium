package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_019_AmericanGolf {
	public static void main(String[] args) {
		testApp();
		
	}
	public static void testApp() {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://americangolf.co.uk");
		driver.manage().window().maximize();
		driver.findElements(By.xpath("//i[@class='icon icon-basket']")).get(1).click();
	}

}
