package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleBrowserLaunch {
	static WebDriver driver;
	
	public static void main(String[] args)  {
		
		launch();

}
	
	
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
		
		String browser ="Edge";
		
		
		if(browser.equals("Mozilla")) 
			driver = new FirefoxDriver();
		 else if(browser.equals("Chrome"))
			driver = new ChromeDriver();
		else if(browser.equals("Edge"))
			driver = new EdgeDriver();
		
		
		// browser init
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		// commands
		
	}
}
