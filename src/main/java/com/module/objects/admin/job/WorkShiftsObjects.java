package com.module.objects.admin.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkShiftsObjects {
	
	@FindBy(id="menu_admin_workShift")
	public WebElement workShiftsTab;
	
	@FindBy(id="workShift_name")
	public WebElement workShiftName;
	
	@FindBy(id="workShift_workHours_from")
	public WebElement workFrom;
	
	@FindBy(xpath = "(//option[@value='06:00'])[1]")
	public WebElement workOnTime;
	
	@FindBy(id="workShift_workHours_to")
	public WebElement workTo;
	
	@FindBy(xpath="(//option[@value='18:00'])[1]")
	public WebElement workOffTime;

}
