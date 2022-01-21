package weblocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_020_Amazon {
static WebDriver driver;
	
	public static void main(String[] args) {
		testApp();
		
	}

	
	public static void testApp() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		
		List<WebElement> names =driver.findElements(By.cssSelector("div.s-title-instructions-style h2 a"));
		List<WebElement> prices =driver.findElements(By.cssSelector("div.s-price-instructions-style span "));
		

		for(int i=0;i<names.size();i++) 
		{
			//System.out.println(names.get(i).getText()+prices.get(i).getText());
			
			 String productName=names.get(i).getText();
			 if( productName!=null &&  productName.toLowerCase().contains("black")) {
				 System.out.println(names.get(i).getText()+prices.get(i).getText());
					
			 }
			
			}
		}
		
		
	}


