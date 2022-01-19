package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tempbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
		//FirefoxDriver f1 = new FirefoxDriver();
		//ChromeDriver f2 = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver d2  = new ChromeDriver();
		d2.get("http://yahoo.com"); // chrome to yahoo
		d2 = new ChromeDriver();
		d2.get("http://quickitdotnet.co.in");// firefox qtpselenium
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver f = new FirefoxDriver();
		f = new FirefoxDriver();
		
		
		
	}

}
