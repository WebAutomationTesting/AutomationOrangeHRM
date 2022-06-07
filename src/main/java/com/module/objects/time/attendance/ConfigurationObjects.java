package com.module.objects.time.attendance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurationObjects {

	@FindBy(id="menu_time_viewTimeModule")
	public WebElement time;

	@FindBy(id="menu_attendance_Attendance")
	public WebElement attendence;

	@FindBy(xpath = "(//a[text()='Configuration'])[1]")
	public WebElement configuration;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement attendenceconfiguration1;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement attendenceconfiguration2;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	public WebElement attendenceconfiguration3;

	@FindBy(id="btnSave")
	public WebElement save;
}
