package browsers;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetDimension {
	static WebDriver driver;

	public static void main(String[] args) {
		// Handling Dimensions for opening browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://quickitdotnet.co.in");
		int width = 400;
		int height = 200;
		
		
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));

	}

}
