package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_013_WebElement_ByXpath_usingstartswith {

	// Find webElement by "startswith" web locator
	static WebDriver driver;

	public static void main(String[] args)// Static method
	{
		launchbrowser();
		
		startswithfunction();
		
	}

	public static void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://testphp.vulnweb.com/login.php");

		driver.manage().window().maximize();

	}

	

	public static void startswithfunction() {
		WebElement label = driver.findElement(By.xpath("//a[starts-with(text(),'Acunetix')]"));
		System.out.println(label.getText());
	}
}
