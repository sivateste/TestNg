package msxl_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class sheetfiles {
	
	@Test 
	 public static void main(String[] args) throws IOException {
		//read the path of execl file
		FileInputStream fi = new FileInputStream("C:\\Users\\Sivareddy_Padigiredd\\Workspace\\TestNG2\\Book123.xlsx");
		//get wb from file
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		//get sheet form wb 
		XSSFSheet ws = wb.getSheetAt(0);
		//get first row from login sheet
		XSSFRow row =ws.getRow(1);
		//count no.of rows in a sheet
		int rowcount = ws.getLastRowNum();
		//count no.of cell in first rows
		int cellcount =row.getLastCellNum();
		System.out.println(rowcount+" "+cellcount);		
	
//		FileInputStream fi =new FileInputStream(".\\Datafile\\Book123.xlse");
//		
//		XSSFWorkbook wb= new XSSFWorkbook(fi);
//		XSSFSheet ws = wb.getSheetAt(0);
//		XSSFRow row =ws.getRow(1);
//		int rowcount =ws.getLastRowNum();
//		int cellcount =row.getLastCellNum();
//		System.out.println(rowcount+" "+cellcount);
		
		
	}
	
}
