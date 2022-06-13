package com.module.objects.leave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLeaveobjects {
	
	@FindBy(id="menu_leave_viewLeaveModule")
	public WebElement leaveHeader;
	
	@FindBy(id="menu_leave_viewMyLeaveList")
	public WebElement myleaveLink;
	
	@FindBy(id="calFromDate")
	public WebElement fromDate;
	
	@FindBy(id="calToDate")
	public WebElement toDate;
	
	@FindBy(id="btnSearch")
	public WebElement search;

}
