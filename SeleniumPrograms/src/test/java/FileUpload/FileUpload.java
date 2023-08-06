package FileUpload;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {
	static WebDriver driver;

		
		public static void main(String[] args) {
			
			
			login();
			try {
				Thread.sleep(5000);
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
		public static void fileUpload(){
			WebElement obj = driver.findElement(By.xpath("//input[@id='photofile']"));
			obj.sendKeys(System.getProperty("user.dir")+"//src//test//resources//images//abc.jpg");
		}
		



		


	}

