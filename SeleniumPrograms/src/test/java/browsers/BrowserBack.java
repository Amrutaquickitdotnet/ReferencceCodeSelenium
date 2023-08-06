package browsers;

import org.openqa.selenium.chrome.ChromeDriver;



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
