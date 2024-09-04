package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class Login_TC01 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		
		LoginPage login = new LoginPage(driver);
		
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		
		login.clickLoginButton();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
