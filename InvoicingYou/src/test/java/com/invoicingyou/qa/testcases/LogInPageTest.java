//
//package com.invoicingyou.qa.testcases;
//
//import java.io.IOException;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.invoicingyou.base.Base;
//import com.invoicingyou.dto.Login;
//import com.invoicingyou.qa.pages.DashboardPage;
//import com.invoicingyou.qa.pages.LogInPage;
//import com.invoicingyou.qa.util.*;
//
//public class LogInPageTest extends Base {
//
//	LogInPage loginpage;
//	DashboardPage dashboardPage;
//	ExcelFileUtility fileUtility = new ExcelFileUtility();
//	GlobalUtility utility = new GlobalUtility();
//
//	public LogInPageTest() {
//		super();
//	}
//
//	@BeforeMethod
//	public void setup() {
//		initializeBrowser();
//		loginpage = new LogInPage();
//	}
//
//	@Test(priority = 1)
//	public void TestLogIn() throws IOException {
//		Login cred = utility.GetLoginCreds().get(0);
//		loginpage.login(cred);
//
//	}
//
//	@AfterMethod
//	public void Shut() {
//
//		driver.quit();
//
//	}
//
//}
