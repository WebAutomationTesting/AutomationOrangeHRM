package com.module.objects.leave.entitlements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeEntitlementsObjects {
	
	@FindBy(id="menu_leave_viewLeaveModule")
	public WebElement leaveHeader;
	
	
	@FindBy(id="menu_leave_Entitlements")
	public WebElement entitlementsSubHeader;
	
	@FindBy(id="menu_leave_viewLeaveEntitlements")
	public WebElement employeeEntitlementsLink;
	
	@FindBy(id="entitlements_employee_empName")
	public WebElement employeeName;
	
	@FindBy(xpath = "//li[@class='ac_even ac_over']")
	public WebElement name;
	
	@FindBy(id="entitlements_leave_type")
	public WebElement leaveType;
	
	@FindBy(xpath = "//option[text()='CAN - Bereavement']")
	public WebElement type;
	
	@FindBy(xpath = "//select[@id='period']")
	public WebElement leavePeriod;
	
	@FindBy(xpath = "//option[text()='2020-01-01 - 2020-12-31']")
	public WebElement period;
	
	@FindBy(id="searchBtn")
	public WebElement search;
}
