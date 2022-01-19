package parallelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunningTestSuites{
	public WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
		driver = new ChromeDriver();
	}

       @Test
 	public void ChromeTestMethod()
 	{ 

	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver.get("https://opensource-demo.orangehrmlive.com/"); 
	 
 
      }
       
       
 
     @AfterTest
     public void afterTest() {
	 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
	 driver.close();
    }
}
