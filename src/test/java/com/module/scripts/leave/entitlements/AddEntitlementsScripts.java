package com.module.scripts.leave.entitlements;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.entitlements.AddEntitlementsUtils;

public class AddEntitlementsScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	AddEntitlementsUtils addEntitlementsUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		addEntitlementsUtils=PageFactory.initElements(driver, AddEntitlementsUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);

	}

	@Test
	public void addEntitlements() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		addEntitlementsUtils.clickOnAddEntitlements();
		waitUtils.waitTime(1000);
		addEntitlementsUtils.clickOnEmpName("Joe Root");
		waitUtils.waitTime(1000);
		addEntitlementsUtils.selectOnLeavetype("US - Bereavement");
		waitUtils.waitTime(1000);
		addEntitlementsUtils.selectOnLeaveperiod("2022-01-01 - 2022-12-31");
		waitUtils.waitTime(1000);
		addEntitlementsUtils.enterEntitlement("20");
		addEntitlementsUtils.clicksave();
	}

}
