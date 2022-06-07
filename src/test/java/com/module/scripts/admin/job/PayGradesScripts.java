package com.module.scripts.admin.job;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.job.PayGradesutils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class PayGradesScripts extends BaseClass{
	
	PayGradesutils payGradesutils;
	LoginLogoutpageObjects loginLogoutpageObject;
	LoginLogoutpageUtils  loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		payGradesutils=PageFactory.initElements(driver,PayGradesutils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);	
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}
	@Test
	public void jobdetails() {
		loginLogoutpageUtils.applicationURL("Admin","admin123");
		loginLogoutpageUtils.clickOnAdmin();
		loginLogoutpageUtils.clickOnUsermanagement();
		payGradesutils.clickOnJob();
		payGradesutils.clickOnPayGrades();
		payGradesutils.clickOnADD();
		payGradesutils.enterName("HRM");
		payGradesutils.clickOnSave();
	}

}
