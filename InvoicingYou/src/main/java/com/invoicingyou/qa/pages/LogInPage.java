
package com.invoicingyou.qa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invoicingyou.base.Base;
import com.invoicingyou.dto.Login;

public class LogInPage extends Base {

	private static final Logger logger = LogManager.getLogger(LogInPage.class);

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement logInBtn;

	@FindBy(linkText = "Create an account now!")
	WebElement signInBtn;

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public DashboardPage login(Login login) {
		try {

			logger.debug("Login credential: " + login.getUsername() + "/" + login.getPassowd());
			//System.out.println(login.getUsername() + " " + login.getPassowd());
			username.sendKeys(login.getUsername());
			password.sendKeys(login.getPassowd());
			logInBtn.click();
			logger.info("Login button clicked");
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex.getStackTrace());
		}
		logger.info("Riderecting to dashboard page");

		return new DashboardPage();
	}
}
