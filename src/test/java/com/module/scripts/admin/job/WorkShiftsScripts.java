package com.module.scripts.admin.job;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.job.JobCategoriesUtils;
import com.module.utils.admin.job.WorkShiftsutils;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class WorkShiftsScripts extends BaseClass{

	LoginLogoutpageUtils  loginLogoutpageUtils;
	JobCategoriesUtils jobCategoriesUtils;
	UserspageUtils userspageUtils;
	WorkShiftsutils workShiftsutils;

	@BeforeClass
	public void loadClass() {	
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		jobCategoriesUtils=PageFactory.initElements(driver, JobCategoriesUtils.class);
		userspageUtils=PageFactory.initElements(driver, UserspageUtils.class);
		workShiftsutils=PageFactory.initElements(driver,WorkShiftsutils.class);
	}

	@AfterMethod
	public void logoutApplication() {
		loginLogoutpageUtils.applicationlogout();
	}

	@Test
	public void createworkShiftsDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		workShiftsutils.clickOnWorkShift();
		userspageUtils.clickOnAdd();
		workShiftsutils.AddWorkShiftDetails("yedu");
		workShiftsutils.selectFrom("08:00");
		workShiftsutils.selectTo("18:00");
		userspageUtils.clickOnSave();
		//loginLogoutpageUtils.applicationlogout();
	}

}
