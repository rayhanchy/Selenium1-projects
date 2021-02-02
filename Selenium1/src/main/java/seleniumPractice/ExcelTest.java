package seleniumPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook ("./Data/inventory.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		short columncount = sheet.getRow(0).getLastCellNum();
		System.out.println(columncount);
		
		
		
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <columncount; j++) {
				XSSFCell cell = row.getCell(j);
				
				
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
			}
		}
		
		
	}


