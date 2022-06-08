package com.module.scripts.time.attendance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.attendance.ConfigurationUtils;

public class ConfigurationScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	ConfigurationUtils configurationUtils;
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		configurationUtils=PageFactory.initElements(driver, ConfigurationUtils.class);
	}
	@Test
	
public void timeattendance() {
	loginLogoutpageUtils.applicationCredentials("Admin","admin123");
	configurationUtils.clickontime();
	configurationUtils.clickonattendence();
	configurationUtils.clickonconfiguration();
	configurationUtils.clickonattendenceconfiguration1();
	configurationUtils.clickonattendenceconfiguration2();
	configurationUtils.clickonattendenceconfiguration3();
	configurationUtils.clickonsave();
}
}