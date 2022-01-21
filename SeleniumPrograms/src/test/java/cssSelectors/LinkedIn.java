package cssSelectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {
	public static void main(String[] args) {
		linkedIn();
	}
	
	public static void linkedIn() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignsession_passwordIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("XYZ");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);
		
		
		driver.findElement(By.name("session_password")).sendKeys("PASS");
		
		
		
		
		
		
		
	}

}
