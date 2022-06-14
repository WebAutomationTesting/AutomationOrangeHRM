package com.module.scripts.dashboard;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.dashboard.Dashboardutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class Dashboardscripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	Dashboardutils dashboardutils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		dashboardutils=PageFactory.initElements(driver, Dashboardutils.class);
	}

	@Test
	public void dashboardDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		dashboardutils.clickOnDashboard();
	}
}
