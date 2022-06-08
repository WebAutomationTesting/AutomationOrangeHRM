package com.module.scripts.time.timesheets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.timesheets.EmployeeTimesheetsUtils;

public class EmployeeTimesheetsScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	EmployeeTimesheetsUtils employeeTimesheetsUtils;
	
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
        employeeTimesheetsUtils=PageFactory.initElements(driver, EmployeeTimesheetsUtils.class);

    }
	@Test
	public void EmployeeTimesheet() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		employeeTimesheetsUtils.clickontime();
		employeeTimesheetsUtils.clickontimesheets();
		employeeTimesheetsUtils.clickonEmployeeTimesheet();
		employeeTimesheetsUtils.enterEmployeeName("Russel Hamilton");
		employeeTimesheetsUtils.clickonview();
	}
}