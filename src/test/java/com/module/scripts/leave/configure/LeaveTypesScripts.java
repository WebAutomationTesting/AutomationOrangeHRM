package com.module.scripts.leave.configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.objects.leave.configure.LeaveTypesObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.configure.LeaveTypesUtils;

public class LeaveTypesScripts extends BaseClass{
	
	LeaveTypesUtils leaveTypesUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		leaveTypesUtils=PageFactory.initElements(driver, LeaveTypesUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		
	}
	
	@Test
	public void LoginCredentials() {
		loginLogoutpageUtils.applicationURL("Admin","admin123");
		leaveTypesUtils.selectLeave();
		leaveTypesUtils.selectConfigure();
		leaveTypesUtils.selectLeaveTypes();
		leaveTypesUtils.clickOnAdd();
		leaveTypesUtils.enterText("personal");
		leaveTypesUtils.clickOnSave();
		
	}

}
