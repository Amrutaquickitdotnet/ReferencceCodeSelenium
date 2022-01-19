package weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_002_maximise_window {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		Window win = driver.manage().window();
		win.maximize();
	}

}
