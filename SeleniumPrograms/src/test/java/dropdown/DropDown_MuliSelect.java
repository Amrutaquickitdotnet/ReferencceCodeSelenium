package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_MuliSelect {

	static ChromeDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  driver  = new ChromeDriver();
		
		dropdown();

	}

	
	public static void dropdown() {
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//*[@id='fruits']"));
		Select selec = new Select(e);
		selec.selectByVisibleText("Apple");
		selec.selectByIndex(2);
		selec.deselectByIndex(1);
		List<WebElement> options = selec.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println("text is :" + options.get(i).getText());
			System.out.println("value is :" + options.get(i).getAttribute("value"));
		}

	}

}
