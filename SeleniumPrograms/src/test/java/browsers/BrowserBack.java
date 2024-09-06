package browsers;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;



public class BrowserBack {

	public static void main(String[] args) {
		
		

		
		 ChromeDriver d2  = new ChromeDriver();
		d2.navigate().to("http://yahoo.com"); // chrome to yahoo
	
		d2.manage().window().maximize();
		d2.get("http://quickitdotnet.co.in");// 
		d2.navigate().back();
		d2.navigate().forward();
		d2.navigate().refresh();
		
		
		
		
	}

}
