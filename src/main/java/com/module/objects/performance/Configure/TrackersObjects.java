package com.module.objects.performance.Configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackersObjects {

	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement performance;

	@FindBy(xpath = "//a[@id='menu_performance_Configure']")
	public WebElement configure;

	@FindBy(xpath = "//a[text()='Trackers']")
	public WebElement trackers;

	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement add;

	@FindBy(id = "addPerformanceTracker_tracker_name")
	public WebElement trackerName;

	@FindBy(id = "addPerformanceTracker_employeeName_empName")
	public WebElement employeeName;

	@FindBy(xpath = "//option[@value='1']")
	public WebElement orangetest;

	@FindBy(id = "btnAssignEmployee")
	public WebElement adD;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement sAve;

}
