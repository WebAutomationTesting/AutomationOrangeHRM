package com.module.scripts.performance.managereviews;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.managereviews.MyReviewsUtils;

public class MyReviewsScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	MyReviewsUtils myReviewsUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		myReviewsUtils=PageFactory.initElements(driver, MyReviewsUtils.class);
	}

	@Test
	public void MyReviewsDetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		myReviewsUtils.clickonPerfomance();
		myReviewsUtils.clickonManageReviews();
		myReviewsUtils.clickonMyReviews();
	}

}
