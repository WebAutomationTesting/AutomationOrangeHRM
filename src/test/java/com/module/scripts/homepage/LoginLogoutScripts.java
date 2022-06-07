package com.module.scripts.homepage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class LoginLogoutScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;

	@BeforeClass

	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);

	}

	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationURL("Admin","admin123");
		loginLogoutpageUtils.clickOnAdmin();
		loginLogoutpageUtils.clickOnUsermanagement();
		loginLogoutpageUtils.clickOnUser();
	}

	@AfterMethod
	public void logout() {
		loginLogoutpageUtils.applicationlogout();
	}
}

