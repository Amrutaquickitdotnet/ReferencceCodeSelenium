package FileHandling;


import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromxls_XSSFFormat {

	    public static void main(String[] args) throws Exception 
	    {
	        
	        
	        String excelpath = System.getProperty("user.dir")+"//src/test//resources//Data.xlsx";
	        FileInputStream fs = new FileInputStream(excelpath);
	        XSSFWorkbook wb = new XSSFWorkbook(fs);   
	        XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
	        Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
	        while (itr.hasNext())                 
	        {  
	        Row row = itr.next();  
	        Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
	        while (cellIterator.hasNext())   
	        {  
	        Cell cell = cellIterator.next();  
	        switch (cell.getCellType())               
	        {  
	        case STRING:   //field that represents string cell type  
	        System.out.print(cell.getStringCellValue() + "\t\t\t");  
	        break;  
	        case NUMERIC:   //field that represents number cell type  
	        System.out.print(cell.getNumericCellValue() + "\t\t\t");  
	        break;  
	        default:  
	        }  
	        }  
	        System.out.println("");  
	        }  
	        }  
	       
	       
	}
	


	