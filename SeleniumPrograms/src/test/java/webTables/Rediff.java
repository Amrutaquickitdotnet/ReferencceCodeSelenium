package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rediff {
	static WebDriver driver;

	public static void main(String[] args) {
		testTable();
	}

	public static void testTable() {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// find the current price

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		WebElement baseTable = driver.findElement(By.tagName("table"));
		List<WebElement> rows = baseTable.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		
		List<WebElement> columns = baseTable.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));

		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText() + columns.get(i).getText());

		}
		System.out.println("**********************************************");
		// To find third row of table
		WebElement row = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[17]"));
		String rowtext = row.getText();
		System.out.println("Seventeen  row of table : " + rowtext);

		// to get 3rd row's 3rd column data
		WebElement column = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[17]/td[3]"));
		String columnValue = column.getText();
		System.out.println("Cell value is : " + columnValue);

	}

}
