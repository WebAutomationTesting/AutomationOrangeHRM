package com.module.scripts.time.attendance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;


import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.attendance.PunchInOutUtils;

public class PunchInOutScripts extends BaseClass {

	LoginLogoutpageUtils loginLogoutpageUtils;
	WaitUtils waitUtils;
	PunchInOutUtils punchInOutUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		punchInOutUtils=PageFactory.initElements(driver, PunchInOutUtils.class);
	}

	@Test
	public void punchinoutemployeedetails() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		punchInOutUtils.clickOnPunchInOut();
		punchInOutUtils.punIn("Employee In");
		punchInOutUtils.punchout("Employee out");
	}

}