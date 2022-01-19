package autosuggest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest {
	static WebDriver driver;

	public static void main(String[] args) {
		// Example demonstrate key up functionality
		
		keyup();

	}

	public static void keyup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.via.com/bus-tickets");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.name("src")).sendKeys("Chen");
		  


		driver.findElement(
		    By.xpath("//div[@class='acResults'][1]//li[1]//span")).click();

		driver.findElement(By.xpath("//input[@id='autocomplete_dest']"))
		    .clear();

		driver.findElement(By.xpath("//input[@id='autocomplete_dest']"))
		    .sendKeys("Co");

		driver.findElement(
		    By.xpath("//div[@class='acResults'][2]//li[1]//span")).click();
			 
		}

	

	}

