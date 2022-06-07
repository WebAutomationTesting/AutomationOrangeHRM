package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.configuration.CustomfieldsUtils;


public class CustomFieldsScripts extends BaseClass {
	
	CustomfieldsUtils customfieldsUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	
	public void data() {
		customfieldsUtils=PageFactory.initElements(driver,CustomfieldsUtils.class );
		loginLogoutpageObjects=PageFactory.initElements(driver,LoginLogoutpageObjects.class);
		
	}
	
	@Test
	public void logincredits() {
		
		
	}
	
	
}
