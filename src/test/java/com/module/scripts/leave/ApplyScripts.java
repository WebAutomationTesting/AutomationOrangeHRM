package com.module.scripts.leave;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.ApplyUtils;

public class ApplyScripts extends BaseClass{
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	ApplyUtils applyUtils;
	
	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		applyUtils=PageFactory.initElements(driver, ApplyUtils.class);
		
	}

	@Test
	public void applyLeave() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		applyUtils.clickOnApply();
		
	}
}
