package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_027_checkwelcomeText {
	static WebDriver driver;

	public static void main(String[] args)
	{
	
		
		checkTitle();	
		login();
		checkWelcomeText();
		
	}
	
	public static void checkTitle()
	{
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//*[@id='logInPanelHeading']"));
		String title = e.getText();
		if(title.equalsIgnoreCase("Login Panel"))
		{
			System.out.println("Title is present");
		}else{
			System.out.println("Error: Invalid Title");
		}
		
		
	}
	
	public static void login()
	{
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();
	  
		
	}
	public static void checkWelcomeText()
	{
		WebElement e = driver.findElement(By.xpath("//*[@id='welcome']"));
		String welcome = e.getText();
		if(welcome.equalsIgnoreCase("welcome Admin"))
		{
			System.out.println("Welcome Admin text is available");
		}else
		{
			System.out.println("Error: Welcome Admin Text is not available");
		}
		
	}

}
