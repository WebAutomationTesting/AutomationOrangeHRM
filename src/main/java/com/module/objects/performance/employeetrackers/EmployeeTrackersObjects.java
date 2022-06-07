package com.module.objects.performance.employeetrackers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class EmployeeTrackersObjects {
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;
	
	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement Performance;
	
	@FindBy(xpath = "//a[text()='Employee Trackers']")
	public WebElement Employetracker;
	
	

}
