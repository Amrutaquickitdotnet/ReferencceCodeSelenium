package radiobuttosandScreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButtons {
// select
// which is selected
	//https://patient.labcorp.com/registration
	//input.ng-touched.ng-dirty.ng-valid
	//label[text()='Female']/preceding-sibling::input
	@Test
	public void radio() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		driver.manage().window().maximize();
		List<WebElement> radios = driver.findElements(By.name("reading_proficiency"));
		System.out.println("Total radio buttons " + radios.size());
		
		radios.get(2).click();
		for(WebElement list:radios) {
			System.out.println(list.getAttribute("value"));
		}
		
	}
	
	
}
