

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	static String cellv = null;

	static String cdir = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		readExcelFile("Sheet1");
	}

	public static void readExcelFile(String sName) throws IOException {
		DataFormatter f = new DataFormatter();
		XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(cdir + "//src//test//resources//Drivers//Book1.xlsx"));
		XSSFSheet sheet = book.getSheet(sName);
		int row = sheet.getLastRowNum();

		int column = sheet.getRow(0).getLastCellNum();

		Object[][] o = new Object[row][column];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sheet.getRow(0).getCell(j) + " :");

				System.out.println(o[i][j] = sheet.getRow(i).getCell(j));

			}
			System.out.println("_______________________________");

		}
	}
}
