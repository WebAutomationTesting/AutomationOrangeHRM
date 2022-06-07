package com.module.scripts.leave.configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.configure.HolidaysUtils;

public class HolidaysScripts extends BaseClass{
	
	HolidaysUtils holidaysUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		holidaysUtils=PageFactory.initElements(driver, HolidaysUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}
	
	@Test
	
	public void LoginCredentails() {
		loginLogoutpageUtils.applicationURL("Admin", "admin123");
		holidaysUtils.selectLeave();
		holidaysUtils.selectConfigure();
		holidaysUtils.selectHolidays();
		holidaysUtils.enterFrom("01-01-2022");
		holidaysUtils.enterTo("31-12-2022");
		holidaysUtils.selectSearch();
		
				
	}

}
