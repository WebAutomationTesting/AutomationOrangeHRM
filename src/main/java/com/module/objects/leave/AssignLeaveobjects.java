package com.module.objects.leave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignLeaveobjects {
	
	@FindBy(xpath="//b[text()='Leave']")
	public WebElement leaveHeader;
	
	@FindBy(id="menu_leave_assignLeave")
	public WebElement assignleaveLink;
	
	@FindBy(id="assignleave_txtEmployee_empName")
	public WebElement empName;
	
	@FindBy(xpath="//strong[text()='Charlie Carter']")
	public WebElement  name;
	
	@FindBy(id="assignleave_txtLeaveType")
	public WebElement leaveType;
	
	@FindBy(xpath="//option[text()='US - Vacation']")
	public WebElement vacation;
	
	@FindBy(id="assignleave_txtFromDate")
	public WebElement fromDate;
	
	@FindBy(id="assignleave_txtToDate")
	public WebElement toDate;
	
	@FindBy(id="assignleave_txtComment")
	public WebElement comment;
	
	@FindBy(id="assignBtn")
	public WebElement assign;

}
