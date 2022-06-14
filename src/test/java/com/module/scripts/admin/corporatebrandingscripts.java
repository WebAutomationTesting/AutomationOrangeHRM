package com.module.scripts.admin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.CorporateBrandingUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class corporatebrandingscripts extends BaseClass {

	CorporateBrandingUtils corporateBrandingUtils;
	LoginLogoutpageObjects loginLogoutpageObject;
	LoginLogoutpageUtils  loginLogoutpageUtils;

	@BeforeClass
	public void load() {
		corporateBrandingUtils=PageFactory.initElements(driver,CorporateBrandingUtils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);	
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);

	}

	@Test
	public void corporateBrandingdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		corporateBrandingUtils.clickOnCorporateBranding();
		corporateBrandingUtils.clickOnPrimary();
		corporateBrandingUtils.clickOnChooseColor();
		corporateBrandingUtils.clickOnChoose();
		corporateBrandingUtils.clickOnPublish();
		corporateBrandingUtils.clickOnPublish();

	}
	
}
