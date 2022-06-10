package com.module.scripts.performance.managereviews;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.objects.performance.managereviews.ManageReviewsObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.managereviews.ManageReviewsUtils;

public class ManageReviewsScripts extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	ManageReviewsObjects manageReviewsObjects;
	ManageReviewsUtils manageReviewsUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void load () {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		manageReviewsObjects=PageFactory.initElements(driver, ManageReviewsObjects.class);
		manageReviewsUtils=PageFactory.initElements(driver, ManageReviewsUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);

	}

	@Test
	public void ManageReviewersDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		manageReviewsUtils.clickonPerformance();
		manageReviewsUtils.clickonManageReviews();
		manageReviewsUtils.clickonSubManager();
		waitUtils.waitTime(500);
		manageReviewsUtils.enterTextEmployeename("Orange Text");
		manageReviewsUtils.clickonJobTitle();
		manageReviewsUtils.selectQaE();
		manageReviewsUtils.clickonStatus();
		manageReviewsUtils.clickonFromDate();
		manageReviewsUtils.selectFromDate();
		manageReviewsUtils.clickonToDate();
		manageReviewsUtils.selectToDate();
		manageReviewsUtils.clickonReviewer();
		manageReviewsUtils.clickonSearch();
		manageReviewsUtils.clickonAdd();
		manageReviewsUtils.enterTextEployee("Orange Test");
		manageReviewsUtils.selectEmployee();
		waitUtils.waitTime(1000);
		manageReviewsUtils.enterTextSupervisior("jack");
		manageReviewsUtils.clickonWorkPeriodStart();
		manageReviewsUtils.selectWorkPeriodStart();
		manageReviewsUtils.clickonWorkPeriodEnd();
		manageReviewsUtils.selectWorkPeriodEnd();
		manageReviewsUtils.clickonDueDate();
		manageReviewsUtils.selectDueDate();
		manageReviewsUtils.clickonSave();
		manageReviewsUtils.clickonActivate();
	}

}