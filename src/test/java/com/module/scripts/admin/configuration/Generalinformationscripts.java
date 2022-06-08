package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.organization.Generalinformationutils;

public class Generalinformationscripts extends BaseClass {

	Generalinformationutils generalinformationutils;
	
	@BeforeClass
	public void load() {
		generalinformationutils=PageFactory.initElements(driver, Generalinformationutils.class);
	}
	
	@Test
	public void logindetails() {

	}
	
}


