

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Second_Excel {
	static String cdir = System.getProperty("user.dir");

	public static void main(String[] args) {
		String s = readToExcel("Sheet1", "A2");

		System.out.println(s);

	} 

	public static String readToExcel(String SheetName, String cellNumber) {
		String cellValue = null;
		try {
			InputStream file = new FileInputStream(cdir + "//src//test//resources//Drivers//Book1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			CellReference cellRefe = new CellReference(cellNumber);
			Row row = sheet.getRow(cellRefe.getRow());
			Cell cell = row.getCell(cellRefe.getCol());
			cellValue = cell.getStringCellValue();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return cellValue;
	}

}
