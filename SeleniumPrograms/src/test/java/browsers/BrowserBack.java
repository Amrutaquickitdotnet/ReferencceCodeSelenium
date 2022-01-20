package browsers;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBack {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver d2  = new ChromeDriver();
		d2.navigate().to("http://yahoo.com"); // chrome to yahoo
		d2 = new ChromeDriver();
		d2.manage().window().maximize();
		d2.get("http://quickitdotnet.co.in");// 
		d2.navigate().back();
		d2.navigate().forward();
		d2.navigate().refresh();
		
		
		
		
	}

}
