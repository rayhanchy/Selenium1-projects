package seleniumPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfiletesting {

	public static String[][] main(String[] args) throws IOException {
		XSSFWorkbook eb = new XSSFWorkbook("./Data/inventory.xlsx");
		XSSFSheet sheet = eb.getSheet("Sheet1");
		
			//int lastRowNum = sheet.getLastRowNum();  //count the row numbers
			//System.out.println(lastRowNum);
			
			
			
				short cellNum = sheet.getRow(0).getLastCellNum();// total column count
				System.out.println(cellNum);
				
				//rowcount
				int rowcount = sheet.getLastRowNum();
				
				//columncount
				short columncount = sheet.getRow(0).getLastCellNum();
				
				
				String [][] data = new String [rowcount][columncount];				
				
							for (int i = 1; i <=rowcount; i++) {
								XSSFRow row = sheet.getRow(i);
								
								for (int j = 0; j < columncount; j++) {
									XSSFCell cell = row.getCell(j);
									
									String value = cell.getStringCellValue();
									System.out.println(value);
									data[i-1][j]=value;
								}
							}
														
							return data;
						}					
						
					}
					
				
				
				
				
			
				
	

