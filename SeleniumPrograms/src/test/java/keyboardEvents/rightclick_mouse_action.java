package keyboardEvents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class rightclick_mouse_action {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		test(driver);
		
	}
	public static void test(WebDriver driver){
		//WebElement e = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/p/span"));
		
		WebElement e1 = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver);
		act.contextClick(e1).build().perform();
		WebElement p = driver.findElement(By.xpath("html/body/ul/li[4]"));
		p.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}

}
