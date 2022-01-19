package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//How to handle dropdown in Selenium

public class Dropdown_Approach3{
	static ChromeDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.manage().window().maximize();
		
		  Select noOfEmployees = new  Select(driver.findElement(By.name("NoOfEmployees")));
		  noOfEmployees.selectByVisibleText("401 - 450");
		 
		Select noOfCountries = new Select(driver.findElement(By.name("Country")));
		noOfCountries.selectByVisibleText("Austria");
	}
		
}
