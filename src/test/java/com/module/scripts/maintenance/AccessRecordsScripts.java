package com.module.scripts.maintenance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.maintenance.AccessRecordsUtils;

public class AccessRecordsScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	AccessRecordsUtils accessRecordsutils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		accessRecordsutils=PageFactory.initElements(driver, AccessRecordsUtils.class);
	}

	@Test
	public void AccessRecordDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		accessRecordsutils.clickOnMaitanance();
		accessRecordsutils.clickOnAccess();
		accessRecordsutils.enterTextPassword("1234");
		accessRecordsutils.clickOnVerify();
	}
}
