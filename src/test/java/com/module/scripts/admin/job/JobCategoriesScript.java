package com.module.scripts.admin.job;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.job.JobCategoriesUtils;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class JobCategoriesScript extends BaseClass {

	LoginLogoutpageUtils  loginLogoutpageUtils;
	JobCategoriesUtils jobCategoriesUtils;
	UserspageUtils userspageUtils;

	@BeforeClass
	public void loadClass() {	
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		jobCategoriesUtils=PageFactory.initElements(driver, JobCategoriesUtils.class);
		userspageUtils=PageFactory.initElements(driver, UserspageUtils.class);
	}

	@AfterMethod
	public void logoutApplication() {
		loginLogoutpageUtils.applicationlogout();
	}

	@Test
	public void createJobCategory() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		jobCategoriesUtils.clickOnCategories();
		userspageUtils.clickOnAdd();
		jobCategoriesUtils.addCategoriesDetails("Professionals");
		userspageUtils.clickOnSave();
		
	}
}
