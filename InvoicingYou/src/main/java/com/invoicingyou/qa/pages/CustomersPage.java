
package com.invoicingyou.qa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invoicingyou.base.Base;
import com.invoicingyou.dto.Customer;

public class CustomersPage extends Base {
	private static final Logger logger = LogManager.getLogger(Base.class);

	public CustomersPage() {
		logger.debug("IN Customer page.." + this.getClass().getName());
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "name")
	WebElement custName;

	@FindBy(name = "email")
	WebElement custEmail;

	@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
	WebElement addCustBtn;

	public void AddNewCustomer(Customer customer) {
		
			try {

			custName.sendKeys(customer.getCustname());
			custEmail.sendKeys(customer.getCustEmail());
			addCustBtn.click();
			//return new DashboardPage();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	
	

}
