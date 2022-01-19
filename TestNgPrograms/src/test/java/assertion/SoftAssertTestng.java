package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestng {
WebDriver driver;
	
	@Test (priority = 2)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = 1)
	public void OpenBrowser() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        SoftAssert softassert = new SoftAssert();
	        Reporter.log("The website used was OrangeHRM for this test", true);
	        String expectedTitle = "Orange HRM";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	      
	        System.out.println("*** Checking For The Second Title ***");

	        softassert.assertEquals(originalTitle, "Orange HRM" );
	   
	        softassert.assertAll();
}
}