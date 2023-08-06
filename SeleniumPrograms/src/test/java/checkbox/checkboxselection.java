package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class checkboxselection {
	static WebDriver driver;

	public static void main(String[] args) {

		login();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		multiplecheckbox();

	}

	public static void login() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement e = driver.findElement(By.xpath("//input[@name='username']"));
		e.sendKeys("Admin");
		e = driver.findElement(By.xpath("//input[@name='password']"));
		e.sendKeys("admin123");
		e = driver.findElement(By.xpath("//button[@type='submit']"));
		e.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}


	public static void allcheck() {

		WebElement e = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']"));

		e.click();
	
		System.out.println("Checkbox was selected:" + e.isSelected());
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.click();// for deselection of checkbox
		System.out.println("Checkbox is disabled"+ " "+e.isSelected());

	}

	public static void lasttwocheckbox() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));

		System.out.println(checkboxes.size());

		int totalcheckboxes = checkboxes.size();

		for (int i = totalcheckboxes - 2; i < totalcheckboxes; i++) {
			checkboxes.get(i).click();

		}
	}

	public static void multiplecheckbox() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][1]"));
		for (WebElement chbox : checkboxes)
		{
			WebElement vacancy = driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]"));
			String vacancyname = vacancy.getText();
			System.out.println(vacancyname);
			
			WebElement hiringManager = chbox.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][4]"));
			String manager = hiringManager.getText();
			String managers = manager.trim().toLowerCase();
        
			if (vacancyname.startsWith("Odis Adalwin".toLowerCase()) || managers.contains("Senior QA Lead".toLowerCase())) {
				chbox.click();
				break;
				
			}
		}
		
		
	}

	public static void firsttwo() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		int totalcheckboxes = checkboxes.size();
		for (int i = 0; i < totalcheckboxes; i++) 
		{
			if (i <2)
			{
				checkboxes.get(i).click();
			}

		}
	}
	
	public static void selectedcheckbox() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		for (WebElement chbox : checkboxes)
		{
			WebElement manager = chbox.findElement(By.xpath("../../td[4]"));
			String hiringManager = manager.getText();
			WebElement vacancyElement  = chbox.findElement(By.xpath("../../td[2]"));
			String vacancy = vacancyElement.getText();
			//System.out.println(vacancy+" " + hiringManager);
			if (hiringManager.startsWith("Linda") && vacancy.contains("Sales Representative")) 
			{
				chbox.click();
				System.out.println(vacancy+ " "+ hiringManager);
			}
		}
	}

}
