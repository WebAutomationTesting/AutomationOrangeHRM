package com.module.objects.leave.configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HolidaysObjects {
	
	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leave;
	
	@FindBy(xpath = "(//a[text()='Configure'])[1]")
	public WebElement configure;
	
	@FindBy(xpath = "//a[text()='Holidays']")
	public WebElement holidays;
	
	@FindBy(xpath = "//input[@id='calFromDate']")
	public WebElement from;
	
	@FindBy(xpath = "//input[@id='calToDate']")
	public WebElement to;
	
	@FindBy(xpath = "//input[@id='btnSearch']")
	public WebElement search;
	
}
