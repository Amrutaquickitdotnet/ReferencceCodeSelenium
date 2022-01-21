package weblocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Example_018_Bankbazaar {

	public static void main(String[] args) {
		try {
			bank();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static void bank() throws InterruptedException {
			ChromeOptions ops = new ChromeOptions();
			//ops.setBinary("");
			//ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
			ops.addArguments("--disable-notifications");
			ops.addArguments("--start-maximized"); 	
			WebDriver driver = new ChromeDriver(ops);
			
		
			driver.get("https://www.bankbazaar.com/finance-tools/emi-calculator.html");
			WebElement e = driver.findElement(By.cssSelector("div.tooltip-inner"));
			Actions act = new Actions(driver);
			act.dragAndDropBy(e, 200,0).build().perform();
		
		}

}
