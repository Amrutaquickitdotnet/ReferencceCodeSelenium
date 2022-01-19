package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_029_login {

	static WebDriver driver;

	public static void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\ReferenceCode\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("admin");

		e = driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin");
		e = driver.findElement(By.id("btnLogin"));
		e.click();

	}

	public static void main(String[] args) {
		// check validation message

		login();

	}
}
