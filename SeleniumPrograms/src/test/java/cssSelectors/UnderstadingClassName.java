package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UnderstadingClassName  extends  TestBase{
	
	@Test
	public void testApp() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("abc");
		
	}

}
