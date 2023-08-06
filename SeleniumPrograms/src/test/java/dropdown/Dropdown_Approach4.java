package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_Approach4 {
	static ChromeDriver driver;

	public static void main(String[] args) {
	
		 ChromeDriver driver  = new ChromeDriver();

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));

		dropDownButton.click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WebElement> list = driver.findElements(
				By.xpath("//div[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']/a"));
		System.out.println("Total items in the dropdowns are :"+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		for (int i = 0; i < list.size(); i++) 
		{

			if (list.get(i).getText().equals("Another action")) {
				list.get(i).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
			}
		}
	}
}
