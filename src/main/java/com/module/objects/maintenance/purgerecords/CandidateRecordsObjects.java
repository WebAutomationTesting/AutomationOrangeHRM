package com.module.objects.maintenance.purgerecords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidateRecordsObjects {

	@FindBy(id = "menu_maintenance_purgeEmployee")
	public WebElement maintanance;

	@FindBy(id = "menu_maintenance_PurgeRecords")
	public WebElement purgeEmployee;

	@FindBy(id = "menu_maintenance_purgeCandidateData")
	public WebElement candidate;

	@FindBy(id = "confirm_password")
	public WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement verify;

}
