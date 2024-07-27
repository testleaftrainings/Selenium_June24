package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Step1: Set the file path of the excel file
		XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		// Step2: Get the sheet
		XSSFSheet sheet = workBook.getSheetAt(0);
//		workBook.getSheet("Sheet1");
		
		//Step3: Get the row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		// Step4: Get the Column Count
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
		//Step5: Get the particular cell
		XSSFCell cell11 = sheet.getRow(1).getCell(1);
		String stringCellValue = cell11.getStringCellValue();
		System.out.println(stringCellValue);
		
		String stringCellValue2 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(stringCellValue2);
		
		String stringCellValue3 = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(stringCellValue3);
		
		System.out.println("-----------------------------");
		//Get all the data from Excel book
		
		
		/*
		 * String cell10 = sheet.getRow(1).getCell(0).getStringCellValue();
		 * System.out.println(cell10); String data11 =
		 * sheet.getRow(1).getCell(1).getStringCellValue(); System.out.println(data11);
		 * String data12 = sheet.getRow(1).getCell(2).getStringCellValue();
		 * System.out.println(data12); String data13 =
		 * sheet.getRow(1).getCell(3).getStringCellValue(); System.out.println(data13);
		 */
		
		//Iterate the row 
		for (int i = 1; i <=rowCount; i++) {
			//Iterate the column
			for (int j = 0; j <colCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		//Step6: Close the workBook
//		workBook.close();
		
	}
	
}
