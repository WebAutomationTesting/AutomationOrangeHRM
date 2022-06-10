package com.module.utils.performance.managereviews;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.performance.managereviews.ManageReviewsObjects;

public class ManageReviewsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public ManageReviewsObjects manageReviewsObjects;
	public WaitUtils waitUtils;

	public ManageReviewsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		manageReviewsObjects=PageFactory.initElements(driver, ManageReviewsObjects.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
	}

	public void clickonPerformance() {
		seleniumUtills.clickOnElement(manageReviewsObjects.performance);
	}
	public void clickonManageReviews() {
		seleniumUtills.clickOnElement(manageReviewsObjects.manageReviews);
	}
	public void clickonSubManager() {
		seleniumUtills.clickOnElement(manageReviewsObjects.subManageReviews);
	}
	public void enterTextEmployeename(String name) {
		seleniumUtills.entertext(manageReviewsObjects.employeeName, name);
	}
	public void clickonJobTitle() {
		seleniumUtills.clickOnElement(manageReviewsObjects.jobTitle);
	}
	public void selectQaE() {
		seleniumUtills.clickOnElement(manageReviewsObjects.qaE);
	}
	public void clickonStatus() {
		seleniumUtills.clickOnElement(manageReviewsObjects.status);
	}
	public void selectAll() {
		seleniumUtills.clickOnElement(manageReviewsObjects.all);
	}
	public void clickonFromDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.frmeDate);
	}
	public void selectFromDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.fromDateSelect);
	}
	public void clickonToDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.toDate);
	}
	public void selectToDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.toDateSelect);
	}
	public void clickonDueDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.dueDate);
	}
	public void selectDueDate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.selectDueDate);
	}
	public void clickonReviewer() {
		seleniumUtills.clickOnElement(manageReviewsObjects.reviwer);
	}
	public void clickonSearch() {
		seleniumUtills.clickOnElement(manageReviewsObjects.search);
	}
	public void clickonAdd() {
		seleniumUtills.clickOnElement(manageReviewsObjects.add);
	}
	public void enterTextEployee(String name) {
		seleniumUtills.entertext(manageReviewsObjects.employee,name);
	}
	public void selectEmployee() {
		seleniumUtills.clickOnElement(manageReviewsObjects.orange);
	}
	public void enterTextSupervisior(String name) {
		seleniumUtills.entertext(manageReviewsObjects.superviser, name);
	}
	public void clickonWorkPeriodStart() {
		seleniumUtills.clickOnElement(manageReviewsObjects.workPeriodStart);
	}
	public void selectWorkPeriodStart() {
		seleniumUtills.clickOnElement(manageReviewsObjects.selectworkPeriodStart);
	}
	public void clickonWorkPeriodEnd() {
		seleniumUtills.clickOnElement(manageReviewsObjects.workPeriodEnd);
	}
	public void selectWorkPeriodEnd() {
		seleniumUtills.clickOnElement(manageReviewsObjects.selectWorkPeriodEnd);
	}
	public void clickonSave() {
		seleniumUtills.clickOnElement(manageReviewsObjects.savE);
	}
	public void clickonActivate() {
		seleniumUtills.clickOnElement(manageReviewsObjects.activateBtN);
	}
	public void clickonBack() {
		seleniumUtills.clickOnElement(manageReviewsObjects.backBtN);
	}

}
