package com.module.scripts.performance.managereviews;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.managereviews.ReviewListUtils;

public class ReviewListScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	ReviewListUtils reviewListUtils;
	WaitUtils waitUtils;
	
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		reviewListUtils=PageFactory.initElements(driver, ReviewListUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
	}
	@Test
	public void ReviewListDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		reviewListUtils.clickonPerfomance();
		reviewListUtils.clickonManageReview();
		reviewListUtils.clickonReviewList();
		reviewListUtils.enterTextEmployee("Orange Test");
		waitUtils.waitTime(500);
		reviewListUtils.clickonJobTitle();
		reviewListUtils.selectJobTitle();
		reviewListUtils.clickonDepartment();
		reviewListUtils.selectDepartment();
		reviewListUtils.clickonStatus();
		reviewListUtils.selectStatus();
		waitUtils.waitTime(100);
		reviewListUtils.clickonFromDate();
		reviewListUtils.selectFromDate();
		reviewListUtils.clickonToDate();
		reviewListUtils.selectToDate();
		reviewListUtils.clickonSearch();
		waitUtils.waitTime(100);
		reviewListUtils.clickonReset();
	}

}
