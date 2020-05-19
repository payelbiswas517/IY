package com.invoicingyou.qa.util;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.invoicingyou.dto.Login;

public class GlobalUtility {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public String GetCellValue(Cell cell) {
		String val = "";

		if (cell != null) {
			switch (cell.getCellType()) {
			case BOOLEAN:
				val = cell.getBooleanCellValue() ? "true" : "false";
				break;
			case NUMERIC:
				val = String.valueOf(cell.getNumericCellValue());
				break;
			case STRING:
				val = cell.getStringCellValue();
				break;
			case BLANK:
				val = "";
				break;
			case ERROR:
				val = "";
				break;
			case FORMULA:
				val = cell.getCachedFormulaResultType().toString();
				break;
			default:
				val = cell.getStringCellValue();
				;
				break;
			}
		}
		return val.trim();
	}

	public ArrayList<Login> GetLoginCreds() throws IOException {
		ArrayList<Login> creds = new ArrayList<Login>();

		Login login = null;
		ExcelFileUtility fileUtility = new ExcelFileUtility();
		Sheet loginDataSheet = fileUtility.readExcel("Login");
		int rowCount = loginDataSheet.getLastRowNum() - loginDataSheet.getFirstRowNum();

		for (int i = 1; i < rowCount + 1; i++) {
			Row row = loginDataSheet.getRow(i);
			login = new Login();
			login.setUsername(GetCellValue(row.getCell(0)));
			login.setPassowd(GetCellValue(row.getCell(1)));
			creds.add(login);
		}

		return creds;
	}
}
