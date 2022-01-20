package autosuggest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {
	static WebDriver driver;

	public static void main(String[] args) {
	
		
		keyup();

	}

	public static void keyup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("Selenium");
		
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Auto Suggest List ::" + list.size());
		
		for(int i = 0 ;i< list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium interview questions"))
			{
				list.get(i).click();
				break;
			}
		}
		
	
		
	}
	
}
