package com.module.objects.performance.managereviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewListObjects {

	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement performance;

	@FindBy(id = "menu_performance_ManageReviews")
	public WebElement manageReviews;

	@FindBy(xpath = "//a[text()='Review List']")
	public WebElement reviewList;

	@FindBy(id = "evaluatePerformanceReview360SearchForm_employeeName")
	public WebElement employeeName;

	@FindBy(id = "evaluatePerformanceReview360SearchForm_jobTitleCode")
	public WebElement jobTitle;

	@FindBy(xpath = "//option[@value='9']")
	public WebElement selectJobTitle;

	@FindBy(id = "evaluatePerformanceReview360SearchForm_department")
	public WebElement department;

	@FindBy(xpath = "(//option[@value='5'])[2]")
	public WebElement selectQAE;

	@FindBy(id = "evaluatePerformanceReview360SearchForm_status")
	public WebElement status;
	
	@FindBy(xpath = "(//option[@value='3'])[3]")
	public WebElement selectStatus;

	@FindBy(id = "fromDate")
	public WebElement fromDate;

	@FindBy(xpath = "//a[text()='2']")
	public WebElement selectFromDate;

	@FindBy(id = "toDate")
	public WebElement toDate;

	@FindBy(xpath = "//a[text()='29']")
	public WebElement selectToDate;

	@FindBy(id = "searchBtn")
	public WebElement search;
	
	@FindBy(id = "btnReset")
	public WebElement reset;

}
