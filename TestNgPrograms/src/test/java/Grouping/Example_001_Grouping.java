package Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_001_Grouping {

static	WebDriver driver;
	
    // Saving the expected title of the Webpage
    String title = "Orange HRM";
    
   
    @Test
    public   void starting_point(){
    	
    	 driver = new ChromeDriver();
    	 driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    
    @Test(groups = { "demo" })	
    public  void checkTitle() {	
       String testTitle = "OrangeHRM";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo" })	
    public  void login() {	
    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
    }
}

