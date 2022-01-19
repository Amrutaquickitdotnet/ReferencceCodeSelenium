package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshots {


	@Test
	public void screenshot() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver  = new ChromeDriver();
		driver.get(
				"https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		driver.manage().window().maximize();

		WebElement menu = driver.findElement(By.cssSelector(".chabad_content_head"));
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			org.openqa.selenium.io.FileHandler.copy(srcFile,
					new File("D:\\SeleniumProgramsQuickitdotnet\\images\\test.jpg"));
			// test.addScreenCaptureFromPath("path of image", "xxxx");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
