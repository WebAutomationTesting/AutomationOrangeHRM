package com.module.scripts.performance.Configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.Configure.TrackersUtils;

public class TrackersScripts extends BaseClass{

	TrackersUtils trackersUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;

	@BeforeClass
	public void load() {
		trackersUtils=PageFactory.initElements(driver, TrackersUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}

	@Test
	public void Trackersdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		trackersUtils.clickonPerformance();
		trackersUtils.clickonConfigure();
		trackersUtils.clickonTrackers();
		trackersUtils.clickonAdd();
		trackersUtils.entertextTrackname("");
		trackersUtils.clickonEmployeeName();
		trackersUtils.clickonOrangeTest();
		trackersUtils.clickonadD();
		trackersUtils.clickonElementSave();

	}
}
