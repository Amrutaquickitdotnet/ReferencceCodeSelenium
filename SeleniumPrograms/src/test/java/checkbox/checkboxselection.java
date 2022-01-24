package checkbox;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxselection {
	static WebDriver driver;

	public static void main(String[] args) {

		login();
		selectedcheckbox();

	}

	public static void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.sendKeys("Admin");
		e = driver.findElement(By.id("txtPassword"));
		e.sendKeys("admin123");
		e = driver.findElement(By.name("Submit"));
		e.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

	}

	/*
	 * select specific chekbox of persons name
	 * 
	 * how to select all checkbox how to select multiplecheckbox how to select last
	 * 2 checkbox how to select first 2 checkbox
	 */
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
		
		/*
		 * String s = "     pooja    "; System.out.println("Before trim"+s);
		 * 
		 * System.out.println("After Trimming"+":"+s.trim());
		 */
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		for (WebElement chbox : checkboxes) {
			WebElement vacancy = chbox.findElement(By.xpath("../../td[2]"));
			String vacancyname = vacancy.getText();
			String desiredvacancy = vacancyname.trim().toLowerCase();
        
			if (desiredvacancy.startsWith("Software Engineer".toLowerCase()) || desiredvacancy.contains("Junior Account Assistant".toLowerCase())) {
				chbox.click();
				
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
