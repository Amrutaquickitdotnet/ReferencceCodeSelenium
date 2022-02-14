package regularexpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_002_useRegularExpression {
	ChromeDriver driver;
    // Saving the expected title of the Webpage
    String title = "Demo Website For Automation";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	 driver = new ChromeDriver();
    	 driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    
    @Test(groups = { "demo1" })	
    public void checkTitle() {	
       String testTitle = "OrangeHRM";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo2" })	
    public void login() {	
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      driver.findElement(By.id("btnLogin")).click();
    }

}
