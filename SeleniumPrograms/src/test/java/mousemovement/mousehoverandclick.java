package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverandclick {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");

		// WebElement element =
		// driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));

		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e = driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e = driver.findElement(By.name("Submit"));
		e.click();
		WebElement tohover = driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
		WebElement toclick = driver.findElement(By.xpath("//*[@id='menu_pim_configurePim']"));

		/*
		 * Actions action = new Actions(driver); action.moveToElement(element);
		 */

		Actions action = new Actions(driver);
		action.moveToElement(tohover).click(toclick).build().perform();
	}

}
