package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*How do you give parameters in TestNG?
There are two ways to pass the parameters in TestNG:

TestNG Parameters
TestNG DataProviders
What is the difference between DataProvider and Parameter in TestNG?
DataProviders pass the different parameters on a single test in a single execution, whereas parameters pass the parameters just 
once per execution in TestNG.
*/
public class DataProviderwithvalidinvaliddata {

	  WebDriver driver;

	    @DataProvider(name = "data-set")
	    public static Object[][] DataSet(){
	        //read the jason or excel data
	        Object[][] obj = {
	                {"valid", "standard_user", "secret_sauce"},
	                {"invalid", "standard_user", "123"}
	                };
	        return obj;
	    }

	    @Test(dataProvider = "data-set")
	    public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
	    	
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        System.out.println(type + " " + username + " " + password);
	       

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	        driver.get("https://www.saucedemo.com/");

	        driver.findElement(By.id("user-name")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("login-button")).click();

	        if(type.equals("valid")){
	            wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.cssSelector("[class='title']")));
	        }else
	            wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.cssSelector("[data-test='error']")));

	        Thread.sleep(2000);
	        driver.quit();
	    }
	    
	    
	}

