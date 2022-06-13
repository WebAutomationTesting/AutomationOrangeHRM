package com.module.objects.maintenance.purgerecords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeRecordsObjects {

	@FindBy(id = "menu_maintenance_purgeEmployee")
	public WebElement maintanance;
	
	@FindBy(id = "menu_maintenance_PurgeRecords")
	public WebElement purgeEmployee;
	
	@FindBy(id = "menu_maintenance_purgeEmployee")
	public WebElement employeeRecord;
	
	@FindBy(id = "confirm_password")
	public WebElement password;
	
	@FindBy(id = "//input[@type='submit']")
	public WebElement verify;
	
}
