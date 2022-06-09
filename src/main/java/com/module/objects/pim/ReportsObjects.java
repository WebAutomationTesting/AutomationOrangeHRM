package com.module.objects.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsObjects {
	
	@FindBy(xpath = "//b[text()='PIM']")
	public WebElement pimHeader;
	
	@FindBy(xpath = "//a[@id='menu_core_viewDefinedPredefinedReports']")
	public WebElement reports;
	
	@FindBy(xpath = "//input[@id='search_search']")
	public WebElement reportname;
	
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_7']")
	public WebElement checkbox;
	
	@FindBy(xpath="//input[@class='searchBtn']")
	public WebElement search;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement add;
	
	@FindBy(xpath = "//select[@id='report_criteria_list']")
	public WebElement employeecriteria;
	
	@FindBy(xpath = "//option[@value='education']")
	public WebElement education;
	
	@FindBy(xpath = "//select[@id='report_include_comparision']")
	public WebElement currentemployee;
	
	@FindBy(xpath = "//option[text()='Current and Past Employees']")
	public WebElement currentpastemployee;
	
	@FindBy(xpath = "//select[@class='drpDown valid']")
	public WebElement displayfeildgroups;
	
	@FindBy(xpath = "//option[text()='Language']")
	public WebElement language;
	
	@FindBy(xpath = "//select[@name='report[include][comparision]']")
	public WebElement displayfeilds;
	
	@FindBy(xpath = "//option[text()='Employee Id']")
	public WebElement employeeid;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement save;
	

}



