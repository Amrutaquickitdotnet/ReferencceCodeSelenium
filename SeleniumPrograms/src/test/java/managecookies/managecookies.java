package managecookies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class managecookies {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("News");

		Cookie cookieobj = new Cookie("news", "india");// To add cookies in my application
		driver.manage().addCookie(cookieobj);
		Cookie cookievalue = driver.manage().getCookieNamed("news");
		System.out.println(cookievalue.getName());
		System.out.println("***** view all cookies****");
		Set<Cookie> cookies = driver.manage().getCookies();// I want to view how many cookies currently available

		for (Cookie ck : cookies) {
			
			System.out.println(ck.getName() + " : " + ck.getValue());
		}
		// delete cookie
		
		driver.manage().deleteCookieNamed("news");
		System.out.println("-----------After Deleting---------");
		
		Set<Cookie> cookies1 = driver.manage().getCookies();// I want to view how many cookies currently available

		for (Cookie ck1 : cookies1) {
			
			System.out.println(ck1.getName() + " : " + ck1.getValue());
		}
		
		System.out.println("Deleting all cookies");
		driver.manage().deleteAllCookies();
		System.out.println("After deleting of all cookies");
		
		Set<Cookie> cookies2 = driver.manage().getCookies();// I want to view how many cookies currently available

		for (Cookie ck2 : cookies2) {
			
			System.out.println(ck2.getName() + " : " + ck2.getValue());
		}
	}

	
}
/*
 * * cookies = driver.manage().getCookies();
 * System.out.println("size of cookies after adding" + cookies.size());
 * driver.manage().deleteCookieNamed("Mycookies");
 * System.out.println("**************"); cookies = driver.manage().getCookies();
 * 
 * System.out.println("size of cookies after deletion" + cookies.size());
 */

// 
//}
