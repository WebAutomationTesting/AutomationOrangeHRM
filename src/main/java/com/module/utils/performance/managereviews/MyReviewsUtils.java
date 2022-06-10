package com.module.utils.performance.managereviews;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.managereviews.MyReviewsObjects;

public class MyReviewsUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public MyReviewsObjects myReviewsObjects;

	public MyReviewsUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		myReviewsObjects=PageFactory.initElements(driver, MyReviewsObjects.class);

	}

	public void clickonPerfomance() {
		seleniumUtills.clickOnElement(myReviewsObjects.performance);
	}
	public  void clickonManageReviews() {
		seleniumUtills.clickOnElement(myReviewsObjects.manageReviews);
	}
	public void clickonMyReviews() {
		seleniumUtills.clickOnElement(myReviewsObjects.myReviews);
	}

}
