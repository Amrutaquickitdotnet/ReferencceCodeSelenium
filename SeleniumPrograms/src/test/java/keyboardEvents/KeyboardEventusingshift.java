package keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEventusingshift {
	static WebDriver driver;
	// Example will demonstrate keyboard event  in new window 
	public static void main(String[] args) {
		
		  driver  = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.linkText("Gmail"));
		Actions act = new Actions(driver);
		act.moveToElement(e);// mouse movement
		act.keyDown(Keys.SHIFT).click(e).keyUp(Keys.SHIFT).build().perform();//keyboardevent
	//	driver.close();
		
		

	}

}
