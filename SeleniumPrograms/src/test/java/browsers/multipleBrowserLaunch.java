package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleBrowserLaunch {
	static WebDriver driver;

	public static void main(String[] args) {

		openBrowser("firefox");

	}

	public static void openBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
			break;
		default:
			System.out
					.println("browser : " + browserType + " is invalid, Launching chromedriver as browser of choice..");
			driver = new ChromeDriver();
		}
	}
}
