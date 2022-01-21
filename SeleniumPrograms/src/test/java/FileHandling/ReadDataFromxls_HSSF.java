package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class ReadDataFromxls_HSSF {
	
		
				public static void ReadExcel() throws IOException
				{
					
				String data = System.getProperty("user.dir")+"//src/test/resources//Testdata.xls";
				
				FileInputStream fs = new FileInputStream(data);//FileIputStream => to read Data from xls
				
				HSSFWorkbook wb = new HSSFWorkbook(fs);
			 
				HSSFSheet sh = wb.getSheet("Sheet1");
				
				
				int TotalRows = sh.getLastRowNum(); 
				
				for(int row = 0; row<TotalRows; row++)
				{
					HSSFRow rObj =  sh.getRow(row);
			
					int TotalColumns= rObj.getLastCellNum();
				for(int column = 0; column<=TotalColumns; column++){
					
					HSSFCell ce=	rObj.getCell(column);
					 
				if(ce != null)
				{
				
					
					
					String str= ce.getStringCellValue();
					
					if(str != null)
					{
						
						 
					
						System.out.print(str+"\t");
					}
				}
					 
				}
				System.out.println(" ");
				}
				
				
				}
				
				public static void main(String[] args) throws IOException {
					ReadDataFromxls_HSSF.ReadExcel();
				}
				
				
				

	}


