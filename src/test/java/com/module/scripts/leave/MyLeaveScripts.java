package com.module.scripts.leave;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.MyLeaveUtils;

public class MyLeaveScripts extends BaseClass{
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	MyLeaveUtils myleaveUtils;
	
	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		myleaveUtils=PageFactory.initElements(driver, MyLeaveUtils.class);
		
	}
	
	@Test
	
	public void myLeave() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		myleaveUtils.clickOnMyLeave();
		myleaveUtils.myLeaveDetails("2022-01-02", "2022-12-30");
		
		
	}
	

	
}
