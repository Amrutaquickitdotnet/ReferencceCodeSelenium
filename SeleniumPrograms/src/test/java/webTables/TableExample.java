package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TableExample {
	static WebDriver driver;

	public static void testTable() {
	
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// find the current price

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	List<WebElement>columns =	table.findElements(By.tagName("td"));
		System.out.println("Rows in the tables are " + rows.size());
		for (WebElement allrows : rows) {
			System.out.println(allrows.getText());
		}
		for(WebElement allColumns:columns) {
			System.out.println(allColumns.getText());
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTable();
	}

}
