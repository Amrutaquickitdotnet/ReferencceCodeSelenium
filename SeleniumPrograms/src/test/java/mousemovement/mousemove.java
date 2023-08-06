package mousemovement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mousemove {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		
	
	{

		
		driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();  
		
	
		 e = driver.findElement(By.xpath("//*[@id='menu_admin_Job']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(e).build().perform();
		act.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e = driver.findElement(By.linkText("Job Titles"));
		act.moveToElement(e).build().perform();
		e.click();
	
		
	}
	}
}
