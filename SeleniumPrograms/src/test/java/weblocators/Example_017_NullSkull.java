package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_017_NullSkull
{
	static WebDriver driver;
	public static void main(String[] args) {
		testApp();
	}
	public static void testApp() {
		
		 driver = new ChromeDriver();
		
		driver.get(" http://www.nullskull.com/articles/SumCaptchaTest.aspx");
		String n1 = driver.findElement(By.id("lblNum1")).getText();
		String n2 = driver.findElement(By.id("lblNum2")).getText();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int sum = num1+num2;
		
		driver.findElement(By.id("txtSum")).sendKeys(String.valueOf(sum));
		
	
	
	}

}
