package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);//lazy initialisation //AjaxElementLocatorFactory
		
	}
	
	@FindBy(tagName = "a")
	WebElement readmoreLink;
	
	@FindBy(id = "txtUsername")
	WebElement usernameElement;
	
	
	
	//locators for password field
	
	@FindBy(id = "txtPassword")
	WebElement passwordElement;	

	// locators for login button
	@FindBy(id = "btnLogin")
	WebElement btnloginElement;	
	
	
	public void enterUserName(String user) {
		usernameElement.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		passwordElement.sendKeys(pass);
	}
	public void clickLoginButton() {
		btnloginElement.click();
	}
}
