package com.invoicingyou.dto;

public class GeneralInvoice {
	
	private String InvoiceName;
	private String Currency;
	private String CustomerName;
	private boolean ExistingCust;
	private String CustomerEmail;
	private String ItemsDesc;
	private Double ItemsQuan;
	private Double ItemPrice;
	private boolean ItemApplyTax;
	private String ChoosePlan;
	private String AddPlanProd;
	private String SelectPlan;
	private String TrialPeriod;
	private boolean ApplyTaxPlan;
	private String Memorandum;
	public String getInvoiceName() {
		return InvoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		InvoiceName = invoiceName;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public boolean isExistingCust() {
		return ExistingCust;
	}
	public void setExistingCust(boolean existingCust) {
		ExistingCust = existingCust;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getItemsDesc() {
		return ItemsDesc;
	}
	public void setItemsDesc(String itemsDesc) {
		ItemsDesc = itemsDesc;
	}
	public Double getItemsQuan() {
		return ItemsQuan;
	}
	public void setItemsQuan(Double itemsQuan) {
		ItemsQuan = itemsQuan;
	}
	public Double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		ItemPrice = itemPrice;
	}
	public boolean isItemApplyTax() {
		return ItemApplyTax;
	}
	public void setItemApplyTax(boolean itemApplyTax) {
		ItemApplyTax = itemApplyTax;
	}
	public String getChoosePlan() {
		return ChoosePlan;
	}
	public void setChoosePlan(String choosePlan) {
		ChoosePlan = choosePlan;
	}
	public String getAddPlanProd() {
		return AddPlanProd;
	}
	public void setAddPlanProd(String addPlanProd) {
		AddPlanProd = addPlanProd;
	}
	public String getSelectPlan() {
		return SelectPlan;
	}
	public void setSelectPlan(String selectPlan) {
		SelectPlan = selectPlan;
	}
	public String getTrialPeriod() {
		return TrialPeriod;
	}
	public void setTrialPeriod(String trialPeriod) {
		TrialPeriod = trialPeriod;
	}
	public boolean getApplyTaxPlan() {
		return ApplyTaxPlan;
	}
	public void setApplyTaxPlan(boolean applyTaxPlan) {
		ApplyTaxPlan = applyTaxPlan;
	}
	public String getMemorandum() {
		return Memorandum;
	}
	public void setMemorandum(String memorandum) {
		Memorandum = memorandum;
	}


}
