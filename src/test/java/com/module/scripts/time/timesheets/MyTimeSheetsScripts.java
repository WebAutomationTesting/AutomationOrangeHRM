package com.module.scripts.time.timesheets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.timesheets.MyTimeSheetsUtils;

public class MyTimeSheetsScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	MyTimeSheetsUtils myTimeSheetsUtils;
	public WaitUtils waitUtils;
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		myTimeSheetsUtils=PageFactory.initElements(driver, MyTimeSheetsUtils.class); 
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
	}

	@Test
	public void mytimesheets() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		myTimeSheetsUtils.clickontime();
		myTimeSheetsUtils.navigateMyTimesheet();
		myTimeSheetsUtils.clickOnEditButton();
		myTimeSheetsUtils.enterProjectName("Global Corp and Co - Global Software phase - 1");
		myTimeSheetsUtils.selectonActivityname(2);
		myTimeSheetsUtils.enterTimeondate("7");
		myTimeSheetsUtils.clickonsave();
	}

}
