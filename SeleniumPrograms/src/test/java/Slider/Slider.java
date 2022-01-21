package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
  driver  = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		//Identify WebElement
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame(0);
		
		slider1(driver);
	}
		public static void slider1(WebDriver driver){
			WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
			
			
			
			//Using Action Class
		
			
			Actions move = new Actions(driver);
		
			move.dragAndDropBy(slider, 10, 500).build().perform();
		
			
			
		}
	}


