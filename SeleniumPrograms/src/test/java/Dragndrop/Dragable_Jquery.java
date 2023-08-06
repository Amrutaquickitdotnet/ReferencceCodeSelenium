package Dragndrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Dragable_Jquery {
static WebDriver driver;
	public static void main(String[] args) {
		
		dragndropObjects();
	}

	
	public static void dragndropObjects()
	{
	
		  driver  = new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/"); 
		  
		  
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.switchTo().frame(0);
		  
		WebElement draggable =  driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable =  driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		  
}
}
