package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Example002_checkonlinkusingsimplefor {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
						
		login();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getAllLinks();
						
					}
					
		public static void getAllLinks( )
					{
						
		WebElement e = driver.findElement(By.xpath("//*[@id='resultTable']"));
		List<WebElement> rows = e.findElements(By.tagName("tr"));
				 for(int i =0; i<rows.size(); i++)
				 {
					 
					 
					 List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
					 
					 
					
					 for(int j =0; j<columns.size(); j++)
					 {
					 
						 if(i==3 && j==1)
						 {
							 
							 WebElement cell =columns.get(j);
							 
							 WebElement link= cell.findElement(By.tagName("a"));
							 
							 link.click();
							 
							 	i= rows.size();
							 	break;
							 	
							 }
						 
						
						
						 
						 
					 }
					 
					 System.out.println(  "  ");
				 }
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
					



					



			



	}


