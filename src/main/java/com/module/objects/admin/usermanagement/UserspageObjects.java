package com.module.objects.admin.usermanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserspageObjects {

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
	
	@FindBy(xpath = "//option[text()='Enabled']")
	public WebElement enabled;
	
}
