////
//package com.invoicingyou.qa.testcases;
//
//import java.io.IOException;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.invoicingyou.base.Base;
//import com.invoicingyou.dto.Login;
//import com.invoicingyou.qa.pages.CustomersPage;
//import com.invoicingyou.qa.pages.DashboardPage;
//import com.invoicingyou.qa.pages.LogInPage;
//import com.invoicingyou.qa.util.GlobalUtility;
//
//public class DashboardPageTest extends Base {
//	private static final Logger logger = LogManager.getLogger(DashboardPageTest.class);
//
//	DashboardPage dashboardpage;
//	CustomersPage customerpage;
//	LogInPage loginpage;
//	GlobalUtility utility = new GlobalUtility();
//
//	public DashboardPageTest() {
//		super();
//		
//	}
//
//	public void setup() {
//		logger.debug("In  Setup..");
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
//		Thread.sleep(5000);
//
//	}
//
//	@Test(priority = 2)
//	public void OpenCustomerPage() throws InterruptedException {
//
//		logger.debug("Open Customer page");
//		customerpage = dashboardpage.clickOnCustomerLink();
//		Thread.sleep(5000);
//		 driver.quit();
//	}
//
//	/*
//	 * @AfterMethod public void Shut() { driver.close(); }
//	 */
//}
