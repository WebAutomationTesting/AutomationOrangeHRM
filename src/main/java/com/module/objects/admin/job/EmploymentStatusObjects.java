package com.module.objects.admin.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmploymentStatusObjects {
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement admin;
	
	@FindBy(id = "menu_admin_Job")
	public WebElement job;

	@FindBy(xpath = "//a[text()='Employment Status']")
	public WebElement employment;
	
	@FindBy(xpath = "//input[@value='Add']")
	public WebElement add;

	@FindBy(xpath = "//a[text()='Employment Status']")
	public WebElement employmentStatus;

	@FindBy(xpath = "//input[@name='empStatus[name]']")
	public WebElement employmentStatusName;

	@FindBy(xpath = "//input[@value='Save']")
	public WebElement save;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	public WebElement permanent;

}
