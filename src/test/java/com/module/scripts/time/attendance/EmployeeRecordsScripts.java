package com.module.scripts.time.attendance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.attendance.EmployeeRecordsUtils;


public class EmployeeRecordsScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	EmployeeRecordsUtils employeeRecordsUtils;
	WaitUtils waitUtils;
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		employeeRecordsUtils=PageFactory.initElements(driver, EmployeeRecordsUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
	}
	@Test
	public void Employeerecorddetails() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		waitUtils.waitTime(500);

	}
}