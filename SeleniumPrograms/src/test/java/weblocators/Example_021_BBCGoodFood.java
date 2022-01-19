package weblocators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Example_021_BBCGoodFood {
	
		
		// JavaScriptExecutor
		@Test
		public void goodFood() throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//*[@id=\"qc-cmp2-ui\"]/div[2]/div/button[2]")).click();
			
			WebElement e = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[8]/div/div/div[1]/ul/li[1]"));
			int y= e.getLocation().y;
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+(y+50)+")");
			Thread.sleep(5000);
			int x= e.getLocation().x;
			y= e.getLocation().y;
			System.out.println(x);
			System.out.println(y);
			js.executeScript("window.scrollTo(0,"+(400)+")");

			
		}
			

}

