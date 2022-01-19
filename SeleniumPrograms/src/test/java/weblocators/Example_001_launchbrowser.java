package weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_001_launchbrowser {

	public static void main(String[] args) {
		
		// default browser is FF => WebBrowserEngine 
		System.setProperty("webdriver.chrome.driver", "D:\\PoojaWeekdays\\JarFiles\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         //interface implements by classname
         
         //webdriver implements chromedriver
         driver.get("https://www.google.co.in/");
          driver.manage().window().maximize();
          
	}

}
