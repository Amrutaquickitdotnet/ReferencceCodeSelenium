package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_Approach1{
	static ChromeDriver driver;

	public static void main(String[] args) {
		countryDropdown();
	}

	public static void countryDropdown() {
		
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.id("input-country"));
		Select se = new Select(countries);
		se.selectByVisibleText("Greece");
		se.selectByValue("6");
		se.selectByIndex(101);

		List<WebElement> allCountries = se.getOptions();
		// print size of items in the list
		System.out.println("There are " + allCountries.size() + " listed in the dropdown");
		System.out.println("Countries list are:");
		for (WebElement countriesList : allCountries) {
			System.out.println(countriesList.getText());
		}

	}

}
