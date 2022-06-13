package com.module.scripts.maintenance.purgerecords;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.maintenance.purgerecords.EmployeeRecordsUtils;

public class EmployeeRecordsScripts extends BaseClass{
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	EmployeeRecordsUtils employeeRecordsutils;
	
	@BeforeClass
	public void load() {
				loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		employeeRecordsutils=PageFactory.initElements(driver, EmployeeRecordsUtils.class);
	}
	
	@Test
	public void EmployeeRecordsDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		employeeRecordsutils.clickOnMaitanance();
		employeeRecordsutils.clickOnPurgueRecords();
		employeeRecordsutils.enterTextVerifyPassword("12345");
		employeeRecordsutils.clickOnVerify();
	}

}
