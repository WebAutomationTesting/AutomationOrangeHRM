package com.module.scripts.admin.organization;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.organization.Locationsutils;

public class Locationsscripts extends BaseClass {
	
	Locationsutils locationsutils;
	@BeforeClass
	public void load() {
		locationsutils=PageFactory.initElements(driver, Locationsutils.class);
	}
  @Test
  public void logindetails() {
	  locationsutils.applicationlogin("Admin", "admin123");
	  
  }
}
