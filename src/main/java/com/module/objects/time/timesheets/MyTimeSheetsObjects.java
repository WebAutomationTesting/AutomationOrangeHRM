package com.module.objects.time.timesheets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTimeSheetsObjects {

	@FindBy(id="menu_time_viewTimeModule")
	public WebElement time;

	@FindBy(xpath = "//a[@id='menu_time_Timesheets']")
	public WebElement timesheets;

	@FindBy(xpath = "//a[text()='My Timesheets']")
	public WebElement mytimesheet;

	@FindBy(xpath = "//input[@id='btnEdit']")
	public WebElement editbutton;

	@FindBy(name="initialRows[0][projectName]")
	public WebElement projectname;
	
	@FindBy(id = "initialRows_0_projectName")
	public WebElement projectName;

	@FindBy(xpath = "(//li[@class='ac_even ac_over'])[1]")
	public WebElement selectProject;

	@FindBy(xpath = "//select[@class='projectActivity']")
	public WebElement Activityname;

	@FindBy(xpath ="(//input[@class=' timeBox'])[1]")
	public WebElement currentdate;
	
	@FindBy(xpath = "//input[@name='initialRows[0][2]']")
    public WebElement wednesday;
	
	@FindBy(xpath = "//input[@id='submitSave']")
	public WebElement save;

	@FindBy(xpath = "//input[@name='btnAddRow']")
	public WebElement addrow;

	@FindBy(xpath = "//input[@name='btnRemoveRows']")
	public WebElement removerows;

	@FindBy(xpath = "//input[@value='Reset']")
	public WebElement reset;

	@FindBy(xpath = "//input[@id='btnBack']")
	public WebElement cancel;
	
}
