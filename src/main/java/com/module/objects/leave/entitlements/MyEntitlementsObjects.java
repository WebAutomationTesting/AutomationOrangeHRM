package com.module.objects.leave.entitlements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEntitlementsObjects {
	

	@FindBy(id="menu_leave_viewLeaveModule")
	public WebElement leaveHeader;
	
	
	@FindBy(id="menu_leave_Entitlements")
	public WebElement entitlementsSubHeader;
	
	@FindBy(id="menu_leave_viewMyLeaveEntitlements")
	public WebElement myEntitlementsLink;
	
	@FindBy(id="entitlements_leave_type")
	public WebElement leaveType;
	
	@FindBy(xpath = "//option[text()='CAN - Bereavement']")
	public WebElement type;
	
	@FindBy(id="period")
	public WebElement leavePeriod;
	
	@FindBy(xpath = "//option[text()='2021-01-01 - 2021-12-31']")
	public WebElement period;
	
	@FindBy(id="searchBtn")
	public WebElement search;

}
