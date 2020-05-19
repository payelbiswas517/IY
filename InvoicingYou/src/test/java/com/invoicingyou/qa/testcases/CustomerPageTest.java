//
//package com.invoicingyou.qa.testcases;
//
//import java.io.IOException;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.invoicingyou.base.Base;
//import com.invoicingyou.dto.Customer;
//import com.invoicingyou.dto.Login;
//import com.invoicingyou.qa.pages.CustomersPage;
//import com.invoicingyou.qa.pages.DashboardPage;
//import com.invoicingyou.qa.pages.LogInPage;
//import com.invoicingyou.qa.util.ExcelFileUtility;
//import com.invoicingyou.qa.util.GlobalUtility;
//
//public class CustomerPageTest extends Base {
//	private static final Logger logger = LogManager.getLogger(CustomerPageTest.class);
//	DashboardPage dashboardpage;
//	CustomersPage customerpage;
//	LogInPage loginpage;
//	ExcelFileUtility fileUtil = new ExcelFileUtility();
//	GlobalUtility utility = new GlobalUtility();
//
//	public CustomerPageTest() {
//		super();
//		
//	}
//
//	// @BeforeTest
//	public void setup() {
//		logger.debug("In Setup..");
//		initializeBrowser();
//		loginpage = new LogInPage();
//		customerpage = new CustomersPage();
//		dashboardpage = new DashboardPage();
//	}
//
//	@Test(priority = 1)
//	public void TestLogIn() throws IOException, InterruptedException {
//		setup();
//		logger.debug("Logging in...");
//		Login cred = utility.GetLoginCreds().get(0);
//		dashboardpage = loginpage.login(cred);
//		Thread.sleep(10000);
//
//	}
//
//	@Test(priority = 2)
//	public void OpenCustomerPage() throws InterruptedException {
//
//		logger.debug("Open Customer page");
//		customerpage = dashboardpage.clickOnCustomerLink(); // Thread.sleep(5000);
//
//	}
//
//	@Test(priority = 3)
//	public void AddCustomer() throws IOException, InterruptedException {
//
//		Customer customer = null;
//		Sheet customerDataSheet = fileUtil.readExcel("Customers");
//		int rowCount = customerDataSheet.getLastRowNum() - customerDataSheet.getFirstRowNum();
//
//		for (int i = 1; i < rowCount + 1; i++) {
//			Row row = customerDataSheet.getRow(i);
//			customer = new Customer();
//			customer.setCustname(utility.GetCellValue(row.getCell(0)));
//			customer.setCustEmail(utility.GetCellValue(row.getCell(1)));
//			customerpage.AddNewCustomer(customer);
//			Thread.sleep(5000);
//			
//		}
//       driver.quit();
//	}
//}
