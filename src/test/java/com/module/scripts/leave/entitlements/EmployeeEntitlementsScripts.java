package com.module.scripts.leave.entitlements;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.entitlements.EmployeeEntitlementsUtils;

public class EmployeeEntitlementsScripts extends BaseClass{
	
	public LoginLogoutpageUtils loginLogoutpageUtils;
	public EmployeeEntitlementsUtils employeeEntitlementsUtils;
	public WaitUtils waitUtils;
	
	
	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		employeeEntitlementsUtils=PageFactory.initElements(driver, EmployeeEntitlementsUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		
	}

	@Test
	public void emlployeeEntitlements() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		employeeEntitlementsUtils.clickOnEmployeeEntitlements();
		waitUtils.waitTime(500);
		employeeEntitlementsUtils.clickOnEmployeeName("Devid Andrews");
		waitUtils.waitTime(500);
		employeeEntitlementsUtils.selectOnLeaveType("CAN - Bereavement");
		waitUtils.waitTime(500);
	    employeeEntitlementsUtils.selectOnLeavePeriod("2022-01-01 - 2022-12-31");
		waitUtils.waitTime(500);
		employeeEntitlementsUtils.clickOnSearch();
		
	}
}
