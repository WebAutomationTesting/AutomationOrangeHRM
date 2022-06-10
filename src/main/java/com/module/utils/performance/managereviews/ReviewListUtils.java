package com.module.utils.performance.managereviews;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.managereviews.ReviewListObjects;

public class ReviewListUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public ReviewListObjects reviewListObjects;

	public ReviewListUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		reviewListObjects=PageFactory.initElements(driver, ReviewListObjects.class);
	}
	public void clickonPerfomance() {
		seleniumUtills.clickOnElement(reviewListObjects.performance);
	}
	public void clickonManageReview() {
		seleniumUtills.clickOnElement(reviewListObjects.manageReviews);
	}
	public void clickonReviewList() {
		seleniumUtills.clickOnElement(reviewListObjects.reviewList);
	}
	public void enterTextEmployee(String name) {
		seleniumUtills.entertext(reviewListObjects.employeeName, name);		
	}
	public void clickonJobTitle() {
		seleniumUtills.clickOnElement(reviewListObjects.jobTitle);
	}
	public void selectJobTitle() {
		seleniumUtills.clickOnElement(reviewListObjects.selectJobTitle);
	}
	public void clickonDepartment() {
		seleniumUtills.clickOnElement(reviewListObjects.department);
	}
	public void selectDepartment() {
		seleniumUtills.clickOnElement(reviewListObjects.selectQAE);
	}
	public void clickonStatus() {
		seleniumUtills.clickOnElement(reviewListObjects.status);
	}
	public void selectStatus() {
		seleniumUtills.clickOnElement(reviewListObjects.selectStatus);
	}
	public void clickonFromDate() {
		seleniumUtills.clickOnElement(reviewListObjects.fromDate);
	}
	public void selectFromDate() {
		seleniumUtills.clickOnElement(reviewListObjects.selectFromDate);
	}
	public void clickonToDate() {
		seleniumUtills.clickOnElement(reviewListObjects.toDate);
	}
	public void selectToDate() {
		seleniumUtills.clickOnElement(reviewListObjects.selectToDate);
	}
	public void clickonSearch() {
		seleniumUtills.clickOnElement(reviewListObjects.search);
	}
	public void clickonReset() {
		seleniumUtills.clickOnElement(reviewListObjects.reset);
	}

}
