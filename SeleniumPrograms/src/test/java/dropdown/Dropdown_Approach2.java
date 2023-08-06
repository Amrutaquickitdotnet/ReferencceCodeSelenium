package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown_Approach2 {
	static ChromeDriver driver;

	public static void main(String[] args) {
		countryDropdown();
	}

	public static void countryDropdown() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.name("Country"));
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
