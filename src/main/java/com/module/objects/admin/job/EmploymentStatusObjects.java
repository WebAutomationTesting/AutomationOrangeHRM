package com.module.objects.admin.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmploymentStatusObjects {
	
	@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
	public WebElement username;
	
	@FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
	public WebElement userRole;
	
	@FindBy(xpath = "//option[text()='Admin']")
	public WebElement admin;
	
	@FindBy(xpath = "//input[@name='searchSystemUser[employeeName][empName]']")
	public WebElement employeeName;
	
	@FindBy(xpath = "//select[@name='searchSystemUser[status]']")
	public WebElement status;

}
