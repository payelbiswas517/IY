package com.invoicingyou.qa.testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;
import com.invoicingyou.dto.GeneralInvoice;
import com.invoicingyou.base.Base;
import com.invoicingyou.dto.Login;
import com.invoicingyou.qa.pages.DashboardPage;
import com.invoicingyou.qa.pages.GeneralInvoicesPage;
import com.invoicingyou.qa.pages.LogInPage;
import com.invoicingyou.qa.util.ExcelFileUtility;
import com.invoicingyou.qa.util.GlobalUtility;

public class GeneralInvoiceTest extends Base {

	private static final Logger logger = LogManager.getLogger(GeneralInvoicesPage.class);
	DashboardPage dashboardpage;
	GeneralInvoicesPage genInvPage;
	LogInPage loginpage;
	ExcelFileUtility fileUtil = new ExcelFileUtility();
	GlobalUtility utility = new GlobalUtility();

	public GeneralInvoiceTest() {
		super();

	}

	public void setup() {
		logger.debug("In Setup..");
		initializeBrowser();
		loginpage = new LogInPage();
		genInvPage = new GeneralInvoicesPage();
		dashboardpage = new DashboardPage();
	}

	@Test(priority = 1)
	public void TestLogIn() throws IOException, InterruptedException {
		setup();
		logger.debug("Logging in...");
		Login cred = utility.GetLoginCreds().get(0);
		dashboardpage = loginpage.login(cred);
		Thread.sleep(10000);

	}

	@Test(priority = 2)
	public void OpenGeneralInvPage() throws InterruptedException {

		logger.debug("Open General INV page");
		genInvPage = dashboardpage.createGenInvoiceLink();

	}

	@Test(priority = 3)
	public void CreateGeneralInvPage() throws InterruptedException, IOException {

		logger.debug("Create General INV ");
		GeneralInvoice genInv = null;
		Sheet GenInvDataSheet = fileUtil.readExcel("GenInvData");
		int rowCount = GenInvDataSheet.getLastRowNum() - GenInvDataSheet.getFirstRowNum();

		for (int i = 1; i < rowCount + 1; i++) {
			Row row = GenInvDataSheet.getRow(i);
			genInv = new GeneralInvoice();
			genInv.setInvoiceName(utility.GetCellValue(row.getCell(0)));
			genInv.setCurrency(utility.GetCellValue(row.getCell(1)));
			genInv.setExistingCust(utility.GetCellValue(row.getCell(2)) == "Y" ? true : false);
			genInv.setCustomerName(utility.GetCellValue(row.getCell(3)));
			genInv.setCustomerEmail(utility.GetCellValue(row.getCell(4)));

			genInv.setItemsDesc(utility.GetCellValue(row.getCell(5)));
			genInv.setItemsQuan(Double.valueOf(utility.GetCellValue(row.getCell(6))));
			genInv.setItemPrice(Double.valueOf(utility.GetCellValue(row.getCell(7))));
			genInv.setItemApplyTax(utility.GetCellValue(row.getCell(8)) == "Y" ? true : false);
			genInv.setChoosePlan(utility.GetCellValue(row.getCell(9)));
			genInv.setAddPlanProd(utility.GetCellValue(row.getCell(10)));
			genInv.setSelectPlan(utility.GetCellValue(row.getCell(11)));
			genInv.setTrialPeriod(utility.GetCellValue(row.getCell(12)));
			genInv.setApplyTaxPlan(utility.GetCellValue(row.getCell(13)) == "Y" ? true : false);
			genInv.setMemorandum(utility.GetCellValue(row.getCell(14)));

			genInvPage.CreateNewInvoice(genInv);
		}

	}
}