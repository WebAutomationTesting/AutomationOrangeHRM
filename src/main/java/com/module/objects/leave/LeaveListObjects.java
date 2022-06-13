package com.module.objects.leave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveListObjects {
	
	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leaveHeader;
	
	@FindBy(id="menu_leave_viewLeaveList")
	public WebElement leavelistLink;
	
	@FindBy(id="calFromDate")
	public WebElement fromDate;
	
	@FindBy(id="calToDate")
	public WebElement toDate;
	
	@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
	public WebElement allCheckbox;
	
	@FindBy(id="leaveList_txtEmployee_empName")
	public WebElement empName;
	
	@FindBy(xpath="//strong[text()='Jacqueline White']")
	public WebElement name;
	
	@FindBy(id="leaveList_cmbSubunit")
	public WebElement subUnit;
	
	@FindBy(xpath = "//option[text()='Administration']")
	public WebElement unit;
	
	@FindBy(id="btnSearch")
	public WebElement search;

}
