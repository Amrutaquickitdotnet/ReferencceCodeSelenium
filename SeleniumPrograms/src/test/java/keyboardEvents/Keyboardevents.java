package keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keyboardevents {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		clickHold();

	}
	public static void clickHold(){
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		
		// # id , . represent class 
		//ol#selectable
		//li.ui-widget-content ui-selectee
		// driver.findelement
		//driver.findelements
		//* All locators
		
		java.util.List<WebElement> L= driver.findElements(By.id("//ol[@id='selectable']"));
		for(WebElement Test:L) {
		System.out.println(Test.getText());
		}
		act.click(L.get(1));
	   //act.click(L.get(4));
		act.keyUp(Keys.CONTROL);
	    act.build().perform();
	}

}
