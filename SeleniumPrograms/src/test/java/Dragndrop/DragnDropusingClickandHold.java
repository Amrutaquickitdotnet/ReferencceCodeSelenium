package Dragndrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDropusingClickandHold {
static ChromeDriver driver;
	public static void main(String[] args) {
		
		
		launchbrowser();
		 
		 dragndrop();
		 
	}
	
	public static void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		  driver  = new ChromeDriver();
		  driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/"); 
		  
		  driver.manage().window().maximize();
		  
		
	}
	public static void dragndrop()
	{
		
        WebElement dgragFrom = driver.findElement(By.xpath("//*[@id= 'ball']"));  
        
        WebElement dropTo = driver.findElement(By.xpath("//*[@id= 'gate']"));        
       
      //Click and Holding the dgragFrom element and moving it to dropTo element
        //and then release the element
        Actions actions = new Actions(driver);
        Action dragAndDropAction = actions.clickAndHold(dgragFrom)
         .moveToElement(dropTo)
         .release(dropTo)
         .build();
        
        //Using perform method to perform above sequence of action
        dragAndDropAction.perform();

	}

}
