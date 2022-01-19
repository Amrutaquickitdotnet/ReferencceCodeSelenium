package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehoverandclick {
static WebDriver driver;
	public static void main(String[] args) {
		// This Example will demonstrate hover and hoverand click method 
		WebDriverManager.chromedriver().setup();
		// ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		
		login();
		WebElement element = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		WebElement tohover = driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
		WebElement toclick = driver.findElement(By.xpath("//*[@id='menu_pim_configurePim']"));
		hover(driver, element);
		hoverandclick(driver, tohover, toclick);
		
	}
	
	
	
	public static void login()
	{
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();
	  
		
	}
	
	public static void hover(WebDriver driver, WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element);
		
	}
	public static void hoverandclick(WebDriver driver , WebElement tohover, WebElement toclick)
	{
		Actions action = new Actions(driver);
		action.moveToElement(tohover).click(toclick).build().perform();
	}

}
	




