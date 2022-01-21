package weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_022_CloseBrowser {

	
		static WebDriver driver;
		public static void main(String[] args) {
			
			driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
	}

}
