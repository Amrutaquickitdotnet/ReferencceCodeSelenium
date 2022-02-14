package keywordEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class KeywordEngine {
	public Workbook book;
	public Sheet sh;

	public void readData() {
        String path = 		System.getProperty("user.dir")+"\\src\\test\\resources\\data.xlsx";

		//String excel_path = "G:\\ReferenceCodeSelenium\\KeywordDrivenProject\\src\\test\\resources\\readdata.xlsx";
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//HssfWorkbook wb = new HSSFworkbook
			book = WorkbookFactory.create(fs);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sh = book.getSheet("Sheet1");
		TestBase.TestBase base = new TestBase.TestBase();
		
		// Find number of rows 
		for(int i=1 ; i<= sh.getLastRowNum(); i++)
		
		{
		String teststeps =	sh.getRow(i).getCell(0).toString().trim();
		String locatorType =	sh.getRow(i).getCell(1).toString().trim();
		System.out.println(locatorType);
		String selector =	sh.getRow(i).getCell(2).toString().trim();
		String action =	sh.getRow(i).getCell(3).toString().trim();
		String value =	sh.getRow(i).getCell(4).toString().trim();
		
		System.out.println(teststeps+":"+ locatorType+":"+selector +":"+ action+":"+value);
		base.execute(teststeps, locatorType, selector, action, value);
		}
		

	}

}
