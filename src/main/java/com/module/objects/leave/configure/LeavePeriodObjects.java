package com.module.objects.leave.configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePeriodObjects {


	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leaveMenu;

	@FindBy(xpath = "(//a[text()='Configure'])[1]")
	public WebElement configuresubMenu;

	@FindBy(xpath = "//a[text()='Leave Period']")
	public WebElement leaveperiodsubsubMenu;

	@FindBy(id="btnEdit")
	public WebElement edit;
	
	@FindBy(id="leaveperiod_cmbStartMonth")
	public WebElement month;
	
	@FindBy(xpath="//option[text()='March'")
	public WebElement smonth;
	
	@FindBy(id="leaveperiod_cmbStartDate")
	public WebElement date;
	
	@FindBy(xpath="//option[text()='30']")
	public WebElement sdate;
	
	@FindBy(id="btnEdit")
	public WebElement save;

	
	
	

}
