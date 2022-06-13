package com.module.objects.leave.entitlements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEntitlementsObjects {

	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leaveHeader;

	@FindBy(xpath = "//a[text()='Entitlements']")
	public WebElement entitlementsSubHeader;

	@FindBy(id="menu_leave_addLeaveEntitlement")
	public WebElement addEntitlementsLink;

	@FindBy(id="entitlements_employee_empName")
	public WebElement empName;

	@FindBy(xpath = "//li[@class='ac_even ac_over']")
	public WebElement name;

	@FindBy(id="entitlements_leave_type")
	public WebElement leaveType;

	@FindBy(xpath = "//option[text()='US - Bereavement']")
	public WebElement type;

	@FindBy(id="period")
	public WebElement leavePeriod;

	@FindBy(xpath = "//option[text()='2022-01-01 - 2022-12-31']")
	public WebElement period;

	@FindBy(id="entitlements_entitlement")
	public WebElement entitlements;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement save;


}
