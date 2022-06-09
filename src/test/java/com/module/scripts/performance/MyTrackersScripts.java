package com.module.scripts.performance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.MyTrackersUtils;

public class MyTrackersScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	MyTrackersUtils myTrackersUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		myTrackersUtils=PageFactory.initElements(driver, MyTrackersUtils.class);
	}
	@Test
	public void mytrackersDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		myTrackersUtils.clickonPerformance();
		myTrackersUtils.clickonmytrackers();
	}

}
