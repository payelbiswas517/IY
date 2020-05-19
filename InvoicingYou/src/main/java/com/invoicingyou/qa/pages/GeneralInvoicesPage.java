package com.invoicingyou.qa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.invoicingyou.base.Base;
import com.invoicingyou.dto.Customer;
import com.invoicingyou.dto.GeneralInvoice;

public class GeneralInvoicesPage extends Base {

	private static final Logger logger = LogManager.getLogger(Base.class);

	public GeneralInvoicesPage() {
		// TODO Auto-generated constructor stub

		logger.debug("IN Invoices page.." + this.getClass().getName());
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/input")
	WebElement genInvName;

	@FindBy(className = "cl_infosd")
	WebElement setcur;

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div/div[2]/div/input")
	WebElement setcurSrc;

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div/div[2]/div/ul/li")
	WebElement currency;

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/label/span")
	WebElement newCustomer;

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/label/span")
	WebElement existingCustomer;
	
	@FindBy(xpath="//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[3]/div/div/div/div[1]/input")
	WebElement custname;
	
	@FindBy(xpath="//*[@id='root']/div/div[3]/div/div/div[2]/div/div[2]/form/div[3]/div/div/div/div[2]/input")
	WebElement custEmail;

	public void SetCurrency(String strCurrency) {
		try {
			setcur.click();
			setcurSrc.click();
			setcurSrc.sendKeys(strCurrency);
			Thread.sleep(2000);
			currency.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SetNewCustomer(GeneralInvoice genInv) throws Exception {
		newCustomer.click();
		Thread.sleep(5000);
		custname.sendKeys(genInv.getCustomerName());
		custEmail.sendKeys(genInv.getCustomerEmail());
	}
	
	public void SetExistingCustomer() throws Exception {
		existingCustomer.click();
		Thread.sleep(5000);
	}
	
	public void CreateNewInvoice(GeneralInvoice genInv) {
		try {
		genInvName.sendKeys(genInv.getInvoiceName());
		SetCurrency(genInv.getCurrency());
		if(genInv.isExistingCust()) {
			existingCustomer.click();
		}else {
			SetNewCustomer(genInv);
		}
		}catch(Exception ex) {
			
		}
		
			
			
	}

}
