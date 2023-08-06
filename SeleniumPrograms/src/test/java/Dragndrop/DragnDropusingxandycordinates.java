package Dragndrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragnDropusingxandycordinates {
static ChromeDriver driver;
	public static void main(String[] args) {
		
		
		launchbrowser();
		 
		 dragndrop();
		 
	}
	
	public static void launchbrowser()
	{
	
		  driver  = new ChromeDriver();
		  driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/"); 
		  
		  driver.manage().window().maximize();
		  
		
	}
	public static void dragndrop()
	{
		
           
 WebElement dragfrom = driver.findElement(By.xpath("//*[@id='ball']"));  
        
       
       
      
        
        Actions actions = new Actions(driver); 
        
        //Moving football to 50,200 offset position
        actions.dragAndDropBy(dragfrom, 50,200).build().perform();

	}

}
