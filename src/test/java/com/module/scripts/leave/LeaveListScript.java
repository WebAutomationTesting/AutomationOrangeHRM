package com.module.scripts.leave;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.LeaveListUtils;

public class LeaveListScript extends BaseClass{
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	LeaveListUtils leaveListUtils;
	
	@BeforeClass
	public void loadclass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		leaveListUtils=PageFactory.initElements(driver, LeaveListUtils.class);
		
	}

	@Test
	public void leaveList() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		leaveListUtils.clickOnLeaveList();
		leaveListUtils.leaveListDetails("2022-01-01", "2022-06-09","Jacqueline White","Administration");
	}
}
