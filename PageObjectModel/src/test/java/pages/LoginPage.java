package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	//locators for username field
	
	By username = By.name("username");
	
	
	//locators for password field
	
	By password = By.name("password");
	
	// locators for login button
	
	By loginButton = By.xpath("//button[@type='submit']");	
	
	public void enterUserName(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
