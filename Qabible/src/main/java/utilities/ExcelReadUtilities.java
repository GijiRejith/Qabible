package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtilities {
	XSSFWorkbook wb;
	XSSFSheet sh;

	public ExcelReadUtilities() throws IOException {

		FileInputStream file = new FileInputStream("D://New folder//Excel1.xlsx");
		wb = new XSSFWorkbook(file);
		sh = wb.getSheet("Sheet1");

	}

	public String data(int r, int c) {
		XSSFRow ro = sh.getRow(r);
		XSSFCell ce = ro.getCell(c);
		CellType ct = ce.getCellType();
		switch (ct) {
		case NUMERIC:
			double d = ce.getNumericCellValue();
			return String.valueOf(d);

		case STRING:
			return ce.getStringCellValue();
		}

		return null;
	}

}
