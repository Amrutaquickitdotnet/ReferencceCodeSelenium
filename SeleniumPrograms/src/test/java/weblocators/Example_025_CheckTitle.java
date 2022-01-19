package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_025_CheckTitle {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\ReferenceCode\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		checkTitle(driver);
		
		
	}
	
	public static void checkTitle(WebDriver driver)
	{
		WebElement e =  driver.findElement(By.xpath("//*[@id='logInPanelHeading']"));
		
		
		String title = e.getText();
		
		
		if(title.equalsIgnoreCase("Login paneL"))
		{
			System.out.println("Title is present");
		}else{
			System.out.println("Error: Invalid Title");
		}
		
		
	}

}
