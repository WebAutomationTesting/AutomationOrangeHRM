package com.module.utils.time.timesheets;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.time.timesheets.EmployeeTimesheetsObjects;
import com.module.objects.time.timesheets.MyTimeSheetsObjects;

public class EmployeeTimesheetsUtils extends BaseClass{
	
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public EmployeeTimesheetsObjects employeeTimesheetsObjects;

	public EmployeeTimesheetsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		employeeTimesheetsObjects=PageFactory.initElements(driver, EmployeeTimesheetsObjects.class);
	}

	public void clickOnTime() {
		seleniumCore.clickOnSubmenu(employeeTimesheetsObjects.time,employeeTimesheetsObjects.timesheets);
	}

	public void clickonEmployeeTimesheet() {
		seleniumUtills.clickOnElement(employeeTimesheetsObjects.EmployeeTimesheet);
	}
	
	public void enterEmployeeName(String name,String comments) {
		seleniumUtills.entertext(employeeTimesheetsObjects.EmployeeName, name);
		waitUtils.waitTime(1000);
		seleniumUtills.clickOnElement(employeeTimesheetsObjects.view);
		seleniumUtills.clickOnElement(employeeTimesheetsObjects.submit);

		seleniumUtills.entertext(employeeTimesheetsObjects.comment, comments);
		seleniumUtills.clickOnElement(employeeTimesheetsObjects.approved);
	}



}