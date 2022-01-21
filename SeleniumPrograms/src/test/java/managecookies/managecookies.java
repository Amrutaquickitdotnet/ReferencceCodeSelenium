package managecookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class managecookies {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		Set<Cookie> cookies = driver.manage().getCookies();

		for (Cookie ck : cookies) {
			System.out.println(ck.getName() + " : " + ck.getValue());
		}
		// how to add cookie to the browser?
		Cookie cookieobj = new Cookie("Mycookies", "123456");
		driver.manage().addCookie(cookieobj);

		cookies = driver.manage().getCookies();
		System.out.println("size of cookies after adding" + cookies.size());
		driver.manage().deleteCookieNamed("Mycookies");
		System.out.println("**************");
		cookies = driver.manage().getCookies();

		System.out.println("size of cookies after deletion" + cookies.size());

	}

}
