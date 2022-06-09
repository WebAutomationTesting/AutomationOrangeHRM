package com.module.scripts.leave.configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.job.EmploymentStatusUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.configure.LeavePeriodUtils;

public class LeavePeriodScripts extends BaseClass {
	
	public LeavePeriodUtils leavePeriodUtils;
	public LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	public void loadClass() {
		leavePeriodUtils=PageFactory.initElements(driver,LeavePeriodUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		
	}
	
	@Test
	public void leavePeriod() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		leavePeriodUtils.clickOnLeaveperiod();
		leavePeriodUtils.leavePeriodDetails();
		leavePeriodUtils.selectStartMonth("March");
		leavePeriodUtils.selectdate("31");
		leavePeriodUtils.save();
		
		
	}
	
}