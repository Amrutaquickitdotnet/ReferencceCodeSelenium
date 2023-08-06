package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkedIn {
	
	 static WebDriver driver;
	public static void main(String[] args) {
		linkedIn();
	}
	
	public static void linkedIn() {
		 driver  = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignsession_passwordIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("XYZ");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);
		
		
		driver.findElement(By.name("session_password")).sendKeys("PASS");
		
		
		
		
		
		
		
	}

}
