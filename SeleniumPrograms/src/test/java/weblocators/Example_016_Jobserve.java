package weblocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// Check all boxes

public class Example_016_Jobserve{


	@Test
	public void testApp() {
		
	ChromeDriver	driver = new ChromeDriver();
		driver.get("https://www.jobserve.com");
		driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		driver.findElement(By.id("ddcl-selInd-i0")).click();
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[id^=ddcl-selInd-i]"));
		List<WebElement> labels = driver.findElements(By.cssSelector("label[for^=ddcl-selInd-i]"));
		System.out.println("Total checkboxes "+ checkboxes.size());
		System.out.println("Total labels "+ labels.size());
		
	}

}
