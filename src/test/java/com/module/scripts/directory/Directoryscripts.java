package com.module.scripts.directory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.directory.Directoryutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class Directoryscripts extends BaseClass {

	LoginLogoutpageUtils loginLogoutpageUtils;
	Directoryutils directoryutils;
	WaitUtils waitUtils;

	@BeforeClass
	public void loadclass() {
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		directoryutils=PageFactory.initElements(driver,Directoryutils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
	}
	@Test
	public void logincredits() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		directoryutils.clickDirectory();
		directoryutils.searchname("Odis Adalwin");
		directoryutils.search();
	}

}
