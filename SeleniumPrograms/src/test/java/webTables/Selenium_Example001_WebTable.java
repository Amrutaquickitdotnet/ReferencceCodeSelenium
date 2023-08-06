package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_Example001_WebTable 
{
 static WebDriver driver;
 
	public static void main(String[] args) {

		
		
		login();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getelements();
		
	}




	public static void login( )
	{
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e= driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e= driver.findElement(By.name("Submit"));
		e.click();
	  
		
	}
	public static void getelements() {
		


		WebElement e = driver.findElement(By.xpath("//*[@id='resultTable']"));
		List<WebElement> rows = e.findElements(By.tagName("tr"));
		int i = 0;
		for (WebElement row : rows) {

			List<WebElement> columns = row.findElements(By.tagName("td"));

			int j = 0;

			for (WebElement column : columns) {

			
				if(i==3 && j==1) {
				  
				  
				  System.out.print(column.getText()); }
				 

				j++;

			}
			i++;
			System.out.println("");
		}
	}

}
