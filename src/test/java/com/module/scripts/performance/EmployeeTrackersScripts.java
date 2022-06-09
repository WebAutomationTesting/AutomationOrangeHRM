package com.module.scripts.performance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.EmployeeTrackersUtils;

public class EmployeeTrackersScripts extends BaseClass{

	EmployeeTrackersUtils employeeTrackersUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;

	@BeforeClass
	public void load() {
		employeeTrackersUtils=PageFactory.initElements(driver, EmployeeTrackersUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}

	@Test
	public void EmployeeTrackersdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		employeeTrackersUtils.clickonElementPerformance();
		employeeTrackersUtils.clickonEmployetracker();
	}
}
