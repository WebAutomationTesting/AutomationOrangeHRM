package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.admin.configuration.LanguagePackagesUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class LanguagePackagesscripts extends BaseClass {

	LanguagePackagesUtils languagePackagesUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void loadclass() {
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
		languagePackagesUtils=PageFactory.initElements(driver,LanguagePackagesUtils.class);
	}
	@Test

	public void logindetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		languagePackagesUtils.clickadmin();
		languagePackagesUtils.clickconfiguration();
		languagePackagesUtils.clicklanguage();
		languagePackagesUtils.clickedit();
		languagePackagesUtils.selectLaunageDropdown("Aghem (Cameroon)");
		languagePackagesUtils.clicksave();


	}

}
