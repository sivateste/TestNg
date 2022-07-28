package msxl_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsheetrRead {

	public static void main(String[] args) throws IOException {

		FileInputStream fi =new FileInputStream("C:\\Users\\Sivareddy_Padigiredd\\Workspace\\TestNG2\\Book123.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheetAt(0);
		int rowcount =ws.getLastRowNum();
		System.out.println("No.of rows"+rowcount);
		String username =ws.getRow(1).getCell(2).getStringCellValue();
		String password =ws.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(username+" "+password);
		
	}

}
