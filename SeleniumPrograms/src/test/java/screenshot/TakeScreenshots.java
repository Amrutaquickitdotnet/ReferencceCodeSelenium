package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshots {

	public static void main(String[] args) {
		screenshot();

	}
	public static void screenshot() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get(
				"https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		driver.manage().window().maximize();

		WebElement menu = driver.findElement(By.cssSelector(".chabad_content_head"));
		
		//File testFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			// get the dynamic folder name
			org.openqa.selenium.io.FileHandler.copy(srcFile,
					new File("G:\\Screenshot\\abc.png"));
			// test.addScreenCaptureFromPath("path of image", "xxxx");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
