package com.module.objects.maintenance.accessrecords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessRecordsObjects {
	
	@FindBy(id = "menu_maintenance_purgeEmployee")
	public WebElement maintanance;

	@FindBy(id = "menu_maintenance_accessEmployeeData")
	public WebElement accessRecord;

	@FindBy(id = "confirm_password")
	public WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement verify;

}
