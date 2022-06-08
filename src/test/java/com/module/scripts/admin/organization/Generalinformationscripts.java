package com.module.scripts.admin.organization;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.organization.Generalinformationutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class Generalinformationscripts extends BaseClass {
	Generalinformationutils generalinformationutils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;

	@BeforeClass
	public void load( ) {
		generalinformationutils=PageFactory.initElements(driver,Generalinformationutils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
	}
	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationURL("Admin","admin123");
		generalinformationutils.selectUserAdmin();
		generalinformationutils.selectorganization();
		generalinformationutils.selectgeneralinfo();
		generalinformationutils.selectedit();
		generalinformationutils.enterorganizationname("smartshift");
		generalinformationutils.enterPhonenumber("7569141938");
		generalinformationutils.entertaxid("8796");
		generalinformationutils.enteremail("malehari33@gmail.com");
		generalinformationutils.enterregistraionNumber("ap9087");
		generalinformationutils.enterfax("76543");

	}
}
