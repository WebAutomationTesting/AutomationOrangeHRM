package com.module.objects.time.timesheets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeTimesheetsObjects {
	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']")
	public WebElement time;

	@FindBy(xpath = "//a[@id='menu_time_Timesheets']")
	public WebElement timesheets;

	@FindBy(xpath = "//a[text()='Employee Timesheets']")
	public WebElement EmployeeTimesheet;

	@FindBy(xpath = "//input[@name='time[employeeName]']")
	public WebElement EmployeeName;

	@FindBy(xpath = "//input[@id='btnView']")
	public WebElement view;
	
	@FindBy(xpath="//a[text()='Add Timesheet']")
	public WebElement AddTimesheet;

}
