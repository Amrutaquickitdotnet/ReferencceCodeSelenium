package skiptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class skiptest {
	WebDriver driver;
	@Test (priority = 2)
	public void CloseBrowser() {
		
		System.out.println("Closing Google Chrome browser");
	}

	@Test (priority = 1)
	public void OpenBrowser() {
		System.out.println("Launching Google Chrome browser"); 	
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
	}

	@Test (enabled = false)
	public void AccountTest(){
		System.out.println("Some tests for Customer Account");
	}

}
