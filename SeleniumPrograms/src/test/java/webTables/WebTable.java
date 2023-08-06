package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class WebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
		testApp();
	}
	
	public static void testApp() {
		
	
		 ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.encodedna.com/javascript/demo/dynamically-add-or-remove-table-rows-using-javascript-and-save-data.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("bt")).click();
		int totalRowsBefore=0;
		int totalRowsAfter=0;
		for(int i=2;i<=10;i=i+2) {
			totalRowsBefore = driver.findElements(By.cssSelector("table#empTable tr")).size();//1
			System.out.println(totalRowsBefore);
			driver.findElement(By.id("addRow")).click();
			totalRowsAfter = driver.findElements(By.cssSelector("table#empTable tr")).size();//2
			System.out.println(totalRowsAfter);
			Assert.assertTrue((totalRowsAfter-totalRowsBefore)==2, "Row not added");
			driver.findElement(By.xpath("//table[@id='empTable']/tbody/tr["+i+"]/td[2]/input")).sendKeys("E1"+i);
			driver.findElement(By.xpath("//table[@id='empTable']/tbody/tr["+i+"]/td[3]/input")).sendKeys("D1"+i);
			driver.findElement(By.xpath("//table[@id='empTable']/tbody/tr["+i+"]/td[4]/input")).sendKeys("20"+i);
			
			
			
		}
		totalRowsBefore = driver.findElements(By.cssSelector("table#empTable tr")).size();//1

		List<WebElement> buttons = driver.findElements(By.xpath("//table[@id='empTable']/tbody/tr/td[1]/input"));
		buttons.get(buttons.size()-1).click();
		
		totalRowsAfter = driver.findElements(By.cssSelector("table#empTable tr")).size();//2
		System.out.println(totalRowsBefore +" --- "+ totalRowsAfter);
		Assert.assertTrue((totalRowsBefore-totalRowsAfter)==1, "Row not deleted");
		
		String name="E16";
		
		
		for(int i=1;i<=totalRowsAfter;i++) {
			List<WebElement> textboxes = driver.findElements(By.cssSelector("table#empTable tr:nth-child("+2*i+")>td>input[type=text]"));
			for(int j=0;j<textboxes.size();j++) {
				String text = textboxes.get(j).getAttribute("value");
				System.out.println(text);
			}
			
		}
		
		
		
		
		
		
	}

}
