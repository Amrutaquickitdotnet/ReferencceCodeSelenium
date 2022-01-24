package windowsmanagement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffAlert {
	public static void main(String[] args) {

		rediff();

	}

	public static void rediff() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		//ansynchronous => 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(5000);
		//implentation of fluent wait 
		/*
		 * 1. impicit wait=> 20
		 *  2.Explicit wait=> 15 min + 5 min (
		 *   3. Fluent wait => 10 min + 5min(Verify)+ TimeDurationtocomplete+
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
	
		Alert al = driver.switchTo().alert();

		//al.accept();
		al.dismiss();
			
		

	}

}
