package screenshot;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TakingScreenshot2 {

	static WebDriver driver;
		public static void main(String[] args) {
			
			login();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			GrabScreenShot();
			
		}
		
		
		
		public static void login()
		{
			WebDriverManager.chromedriver().setup();
			  driver  = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.id("txtUsername"));
			e.sendKeys("Admin");
			e= driver.findElement(By.id("txtPassword"));
			e.sendKeys("admin123");
			e= driver.findElement(By.name("Submit"));
			e.click();
		  
			
		}
		
		
		public static void GrabScreenShot(){
			File screenFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(screenFile, new File("D:\\Amruta\\ReferenceCode\\ReferenceCode\\Screenshot\\abc.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Screenshot Captured!!");
				
	
			
		}


		


	}

