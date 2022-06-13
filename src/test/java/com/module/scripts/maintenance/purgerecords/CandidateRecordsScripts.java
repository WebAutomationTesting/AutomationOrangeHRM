package com.module.scripts.maintenance.purgerecords;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.maintenance.purgerecords.CandidateRecordsUtils;

public class CandidateRecordsScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	CandidateRecordsUtils candidateRecordsUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		candidateRecordsUtils=PageFactory.initElements(driver, CandidateRecordsUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
	}

	@Test
	public void CandidateRecordsDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		candidateRecordsUtils.clickOnMaitanance();
		candidateRecordsUtils.clickOnPurgeRecords();
		waitUtils.waitTime(500);
		candidateRecordsUtils.enterTextPassword("1234");
		candidateRecordsUtils.clickOnVerify();
	}

}
