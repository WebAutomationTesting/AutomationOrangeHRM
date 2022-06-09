package com.module.scripts.admin.organization;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.organization.Locationsutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class Locationsscripts extends BaseClass {
	
	Locationsutils locationsutils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	@BeforeClass
	public void load() {
		locationsutils=PageFactory.initElements(driver, Locationsutils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}
  @Test
  public void logindetails() {
	  loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
	  loginLogoutpageUtils.clickOnAdmin();
	  locationsutils.selectorganization();
	  locationsutils.selectlocation();
	  locationsutils.entername("vrpalli");
	  locationsutils.entercity("nellore");
	  //locationsutils.selectcountry();
	  //locationsutils.selectad();
	  locationsutils.selectCountry("Andorra");
	  
  }
}
