package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.organization.Generalinformationutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class Generalinformationscripts extends BaseClass {

	Generalinformationutils generalinformationutils;
	@BeforeClass
	public void load() {
		generalinformationutils=PageFactory.initElements(driver, Generalinformationutils.class);
	}
	@Test
	public void logindetails() {
		generalinformationutils.applicationlogin("Admin", "admin123");
		generalinformationutils.login("smartshift");

		//generalinformationutils.clickonOrganization();
		


	}
}


