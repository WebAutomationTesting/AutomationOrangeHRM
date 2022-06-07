package com.module.objects.leave.configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkWeekObjects {
	
	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leave;
	
	@FindBy(xpath = "(//a[text()='Configure'])[1]")
	public WebElement configure;
	
	@FindBy(xpath ="//a[text()='Work Week']" )
	public WebElement workweek;
	
	@FindBy(xpath = "//input[@value='Edit']")
	public WebElement edit;

}
