package com.module.objects.leave.configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveTypesObjects {

	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leave;

	@FindBy(xpath = "(//a[text()='Configure'])[1]")
	public WebElement configure;

	@FindBy(xpath = "//a[text()='Leave Types']")
	public WebElement leavetypes;

	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement add;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement name;
	
	@FindBy(xpath = "//input[@name='saveButton']")
	public WebElement save;

}
