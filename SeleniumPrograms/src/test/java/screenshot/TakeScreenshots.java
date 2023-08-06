package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshots {

	public static void main(String[] args) {
		screenshot();

	}

	public static void screenshot() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String screenpath = System.getProperty("user.dir") + "//src/test//resources//Screenshot//gogle.jpeg";
		try {
			// get the dynamic folder name
			FileHandler.copy(srcFile, new File(screenpath));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
