package collections;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CrikInfo  {

	@Test
	public void testApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19048/scorecard/1185155/ireland-women-vs-west-indies-women-2nd-t20i-wi-w-in-eng-and-ire-2019");
		
		List<WebElement> scores = driver.findElements(By.cssSelector("div.match-scorecard-page >div>div:nth-child(1) table.table.batsman>tbody>tr>td:nth-child(3)"));
		List<WebElement> names = driver.findElements(By.cssSelector("div.match-scorecard-page >div>div:nth-child(1) table.table.batsman>tbody>tr>td:nth-child(1)"));
		
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i).getText()+ names.get(i).getText());
			
		}
		
		 
	}

}
