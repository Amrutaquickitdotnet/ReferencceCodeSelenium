package priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgpriority {
	WebDriver driver;
	
	@Test (priority = 2)
	public void CloseBrowser() {
		
		System.out.println("Closing Google Chrome browser");
	}

	@Test (priority = 1)
	public void OpenBrowser() {
		
		 ChromeDriver driver = new ChromeDriver();

		System.out.println("Launching Google Chrome browser"); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
}
