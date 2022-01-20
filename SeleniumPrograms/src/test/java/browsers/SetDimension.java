package browsers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetDimension {
	static WebDriver driver;

	public static void main(String[] args) {
		// Handling Dimensions for opening browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://quickitdotnet.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420, 600);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);

	}

}
