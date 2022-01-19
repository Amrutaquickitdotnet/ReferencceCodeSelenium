package Dragndrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_n_drop {
static ChromeDriver driver;
	public static void main(String[] args) {
		
		
		launchbrowser();
		 WebElement e = driver.findElement(By.id("item5")); 
		 WebElement e1 = driver.findElement(By.id("item1"));
		 dragndrop(driver, e, e1);
		 
	}
	
	public static void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		  driver  = new ChromeDriver();
		driver.get("http://executeautomation.com/demosite/Dragging.html");
		driver.manage().window().maximize();
		
		
	}
	public static void dragndrop(WebDriver driver, WebElement srcElement, WebElement dstElement)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(srcElement, dstElement).build().perform();
	}

}
