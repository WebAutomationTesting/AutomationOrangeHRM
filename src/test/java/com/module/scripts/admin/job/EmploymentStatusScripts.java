package com.module.scripts.admin.job;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.job.EmploymentStatusUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class EmploymentStatusScripts extends BaseClass {
	

	EmploymentStatusUtils employmentStatusUtils;
	LoginLogoutpageObjects loginLogoutpageObject;
	LoginLogoutpageUtils  loginLogoutpageUtils;

	@BeforeClass
	public void load() {
		employmentStatusUtils=PageFactory.initElements(driver,EmploymentStatusUtils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);	
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}
	
	@Test
	public void Employmentdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		loginLogoutpageUtils.clickOnAdmin();
		loginLogoutpageUtils.clickOnUsermanagement();
		loginLogoutpageUtils.clickOnJob();
		employmentStatusUtils.clickOnEmployment();
		employmentStatusUtils.clickOnAdd();
		employmentStatusUtils.enterEmploymentStatusName("Full-Time Permanent");
		employmentStatusUtils.clickOnSave();
		employmentStatusUtils.clickOnPermanent();
		
	}

}
