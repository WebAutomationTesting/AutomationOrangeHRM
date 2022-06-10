package com.module.objects.performance.managereviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageReviewsObjects {

	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement performance;

	@FindBy(id = "menu_performance_ManageReviews")
	public WebElement manageReviews;

	@FindBy(id = "menu_performance_searchPerformancReview")
	public WebElement subManageReviews;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement employeeName;

	@FindBy(xpath = "//select[@class='formSelect']")
	public WebElement jobTitle;

	@FindBy(xpath = "//option[@value='9']")
	public WebElement qaE;

	@FindBy(id = "performanceReview360SearchForm_status")
	public WebElement status;

	@FindBy(xpath = "//option[@value='0']")
	public WebElement all;

	@FindBy(id = "fromDate")
	public WebElement frmeDate;

	@FindBy(xpath = "//a[text()='2']")
	public WebElement fromDateSelect;

	@FindBy(id = "toDate")
	public WebElement toDate;

	@FindBy(xpath = "//a[text()='27']")
	public WebElement toDateSelect;

	@FindBy(id = "performanceReview360SearchForm_reviwerName")
	public WebElement reviwer;

	@FindBy(id = "btnSearch")
	public WebElement search;

	@FindBy(id = "btnAdd")
	public WebElement add;

	@FindBy(id = "saveReview360Form_employee")
	public WebElement employee;

	@FindBy(xpath = "//li[@class='ac_even ac_over']")
	public WebElement orange;

	@FindBy(id = "saveReview360Form_supervisorReviewer")
	public WebElement superviser;

	@FindBy(id = "saveReview360Form_workPeriodStartDate")
	public WebElement workPeriodStart;

	@FindBy(xpath = "//a[text()='2']")
	public WebElement selectworkPeriodStart;

	@FindBy(id = "saveReview360Form_workPeriodEndDate")
	public WebElement workPeriodEnd;

	@FindBy(xpath = "//a[text()='29']")
	public WebElement selectWorkPeriodEnd;
	
	@FindBy(id = "saveReview360Form_dueDate")
	public WebElement dueDate;

	@FindBy(xpath = "//a[text()='5']")
	public WebElement selectDueDate;

	@FindBy(id = "saveBtn")
	public WebElement savE;

	@FindBy(id = "activateBtn")
	public WebElement activateBtN;

	@FindBy(id = "backBtn")
	public WebElement backBtN;


}
