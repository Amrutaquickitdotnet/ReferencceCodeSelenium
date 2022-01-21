package Dragndrop;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_n_drop {
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
		
        //Opening a link in a new tab in Selenium using action class
        WebElement dgragFrom = driver.findElement(By.xpath("//*[@id= 'ball']"));  
        
        WebElement dropTo = driver.findElement(By.xpath("//*[@id= 'gate']"));        
       
      
        //Performing Drag and drop Action
        Actions actions = new Actions(driver); 
        actions.dragAndDrop(dgragFrom, dropTo).build().perform();

	}

}
