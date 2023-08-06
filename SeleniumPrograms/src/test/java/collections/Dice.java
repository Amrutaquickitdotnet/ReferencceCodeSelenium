package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dice {

//Pagination 6 showing the list of jobs 

	public static void main(String[] args) {
		try {
			testApp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testApp() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.dice.com/jobs");
		driver.manage().window().maximize();

		int p = 1;
		while (p != 6) {

			List<WebElement> names = driver.findElements(By.cssSelector("a.card-title-link.bold"));
			System.out.println("Count of jobs" + ":" + names.size());
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i).getText());
			}
			System.out.println("--------------------------------------------------------------------------------");

			p++;
			break;
		}
	}

}
