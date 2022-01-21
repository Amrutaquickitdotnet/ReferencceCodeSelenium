package dropdown;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Approach2 {
	static ChromeDriver driver;

	public static void main(String[] args) {
		countryDropdown();
	}

	public static void countryDropdown() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.id("input-country"));
		Select se = new Select(countries);

		List<WebElement> allCountries = se.getOptions();
		// print size of items in the list
		System.out.println("There are " + allCountries.size() + " listed in the dropdown");

		for (WebElement countriesList : allCountries) {
			if (countriesList.getText().equals("Cuba")) {

				countriesList.click();
				break;
			}
		}

	}

}
