package FileUpload;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FileUpload_usingAutoIT {
	static WebDriver driver;

		
		public static void main(String[] args) throws IOException {
			
			
			login();
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			fileUpload();
			
		}
		
		
		
		public static void login()
		{
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.id("txtUsername"));
			e.sendKeys("Admin");
			e= driver.findElement(By.id("txtPassword"));
			e.sendKeys("admin123");
			e= driver.findElement(By.name("Submit"));
			e.click();
		  
			
		}
		public static void fileUpload() throws IOException{
		
			WebElement obj = driver.findElement(By.id("photofile"));
			Actions act = new Actions(driver);
			act.moveToElement(obj).click().build().perform();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			// C # Process.start
			Runtime.getRuntime().exec("D:\\datatest.exe");
			
		}
		



		


	}

