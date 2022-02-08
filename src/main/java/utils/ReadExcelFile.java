package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static Object[][] getDataFromExcel(String filePath, String sheetName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
		XSSFSheet workSheet = workBook.getSheet(sheetName);
		XSSFRow Row = workSheet.getRow(0);
		int totalRows = workSheet.getPhysicalNumberOfRows();
		int totalColumns = Row.getLastCellNum();
		Object Data[][] = new Object[totalRows][totalColumns];
		for (int i = 1; i <= totalRows - 1; i++) {
			XSSFRow row = workSheet.getRow(i);
			for (int j = 0; j <= totalColumns - 1; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter formatter = new DataFormatter();
				String value = formatter.formatCellValue(cell);
				Data[i][j] = value;  
			}
		}
		return Data;
	}
}