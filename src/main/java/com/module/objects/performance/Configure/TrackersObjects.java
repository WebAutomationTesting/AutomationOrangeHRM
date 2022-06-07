package com.module.objects.performance.Configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackersObjects {
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;
	
	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement Performance;
	
	@FindBy(xpath = "//a[@id='menu_performance_Configure']")
	public WebElement Configure;
	
	@FindBy(xpath = "//a[text()='Trackers']")
	public WebElement Trackers;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement Add;
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement TrackerName;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement EmployeeName;
	
	@FindBy(xpath = "//option[@value='48']")
	public WebElement lacky;
	
	@FindBy(xpath = "(//input[@type='button'])[4]")
	public WebElement ADD;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement Save;
	
	
	
	

}
