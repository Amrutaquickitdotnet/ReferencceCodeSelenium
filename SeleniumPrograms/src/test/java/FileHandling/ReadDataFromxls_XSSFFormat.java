package FileHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromxls_XSSFFormat {

	    public static void main(String[] args) {
	        
	        
	        String excelpath = "D:\\Amruta\\Testexcelprogram.xlsx";
	        FileInputStream inputstream = null;
			try {
				inputstream = new FileInputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        XSSFWorkbook workbook = null;
			try {
				workbook = new XSSFWorkbook(inputstream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        XSSFSheet sheet = workbook.getSheet("Sheet1");
	        
	        // Using for loop
	        
	        int rows = sheet.getLastRowNum();
	        int cols= sheet.getRow(1).getLastCellNum();
	        
	        for(int r=0; r<rows; r++) {
	            
	            XSSFRow row=sheet.getRow(r);
	            
	            for(int c=0; c< cols; c++) {
	                
	                XSSFCell cell=row.getCell(c);
	                switch(cell.getCellType())
	                {
	                case STRING:
	                	System.out.print(cell.getStringCellValue()+"\t"); 
	                break;
	                case NUMERIC: 
	                	System.out.print(cell.getNumericCellValue()+"\t");
	                	break;
	                case BOOLEAN: 
	                	System.out.print(cell.getBooleanCellValue()+"\t"); 
	                	break;
	                
	                }
	                
	            }
	            
	            System.out.println();
	        }
	        
	    }
	}


	