package com.module.scripts.admin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.NationalitiesUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class nationalitiesscripts extends BaseClass {
	
	NationalitiesUtils nationalitiesUtils;
	LoginLogoutpageObjects loginLogoutpageObject;
	LoginLogoutpageUtils  loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		nationalitiesUtils=PageFactory.initElements(driver,NationalitiesUtils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);	
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		
	}
	
	@Test
	public void addNationalitydetails() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		nationalitiesUtils.clickOnNationality();
		nationalitiesUtils.enterName("Raj");
		nationalitiesUtils.clickOnSave();
	}

}
