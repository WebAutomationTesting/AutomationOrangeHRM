package com.module.scripts.leave.entitlements;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.entitlements.MyEntitlementsUtils;

public class MyEntitlementsScripts extends BaseClass{

	public LoginLogoutpageUtils loginLogoutpageUtils;
	public MyEntitlementsUtils myEntitlementsUtils;
	public WaitUtils waitUtils;


	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		myEntitlementsUtils=PageFactory.initElements(driver, MyEntitlementsUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);

	}

	@Test
	public void myEntitlements() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		myEntitlementsUtils.clickOnMyEntitlements();
		myEntitlementsUtils.selectOnLeaveType("CAN - Bereavement");
		waitUtils.waitTime(500);
		myEntitlementsUtils.selectOnLeavePeriod("2022-01-01 - 2022-12-31");
		waitUtils.waitTime(500);
		myEntitlementsUtils.clickOnSearch();

	}

}
