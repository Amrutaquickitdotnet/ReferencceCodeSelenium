package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_assert {
	
WebDriver driver;
	
	
	@Test (priority = 1)
	public void OpenBrowser() {
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	    	
			ChromeDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        
	        Reporter.log("The website used was Orangehrm for this test", true);
	        String expectedTitle = "Orange HRM";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle,"Titles of the website do not match");
  }


}
