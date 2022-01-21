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
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//chromedriver.exe");
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//msedgedriver.exe");

			break;
		default:
			System.out
					.println("browser : " + browserType + " is invalid, Launching chromedriver as browser of choice..");
			driver = new ChromeDriver();
		}
	}
}
