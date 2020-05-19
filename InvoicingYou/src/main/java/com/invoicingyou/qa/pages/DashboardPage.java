package com.invoicingyou.qa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invoicingyou.base.Base;

public class DashboardPage extends Base {

	private static final Logger logger = LogManager.getLogger(DashboardPage.class);

	public DashboardPage() {
		PageFactory.initElements(driver, this);
		logger.info("Dashboard landed. " + this.getClass().getName());

	}

	@FindBy(xpath = "//a/span[2][contains(text(),'Customers')]")
	WebElement customerLink;

	@FindBy(xpath = "//a[contains(text(),'Invoices')]")
	WebElement invoiceLink;

	@FindBy(xpath = "//a[contains(text(),'Widgets')]")
	WebElement widgetLink;
	
	@FindBy(xpath ="//button/span[contains(text(),'+')]")
	WebElement createInvoiceLink;
	
	@FindBy(xpath ="//*[@id='myHeader']/div[2]/div[2]/div/ul/li[1]/a/p")
	WebElement genInvLink;
		

	public CustomersPage clickOnCustomerLink() {

		customerLink.click();
		return new CustomersPage();

	}
	
	public GeneralInvoicesPage createGenInvoiceLink() {

		createInvoiceLink.click();
		genInvLink.click();
		
		return new GeneralInvoicesPage();

	}

	/*
	 * public InvoicesPage clickOninvoiceLink() {
	 * 
	 * invoiceLink.click(); return new InvoicesPage();
	 * 
	 * }
	 * 
	 * public WidgetsPage clickOnwidgetLink() {
	 * 
	 * widgetLink.click(); return new WidgetsPage();
	 * 
	 * }
	 */

}
