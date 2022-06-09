package com.module.scripts.time.timesheets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.timesheets.EmployeeTimesheetsUtils;

public class EmployeeTimesheetsScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	EmployeeTimesheetsUtils employeeTimesheetsUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		employeeTimesheetsUtils=PageFactory.initElements(driver, EmployeeTimesheetsUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
	}
	@Test
	public void EmployeeTimesheet() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		waitUtils.waitTime(500);
		employeeTimesheetsUtils.clickOnTime();
		employeeTimesheetsUtils.clickonEmployeeTimesheet();
		waitUtils.waitTime(500);
		employeeTimesheetsUtils.enterEmployeeName("Russel Hamilton","dataApproved");


	}
}