package com.module.scripts.leave;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.AssignLeaveUtils;

public class AssignLeaveScript extends BaseClass{
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	AssignLeaveUtils assignLeaveUtils;
	
	@BeforeClass
	public void loadcClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		assignLeaveUtils=PageFactory.initElements(driver, AssignLeaveUtils.class);
	}
	
	@Test
	public void assignleave() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		assignLeaveUtils.clickOnAssignleave();
		assignLeaveUtils.assignLeaveDetails("Charlie Carter", "US - Vacation", "2022-06-13", "2022-06-16", "thank you");
		assignLeaveUtils.clickOnassign();
	}

}
