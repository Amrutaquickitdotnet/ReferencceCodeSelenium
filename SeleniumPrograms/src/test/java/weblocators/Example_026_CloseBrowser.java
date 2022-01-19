package weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_026_CloseBrowser {

	
		static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\ReferenceCode\\JarFiles\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
	}

}
