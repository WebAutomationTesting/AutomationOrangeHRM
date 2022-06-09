package com.module.objects.pim.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class ReportingMethodsObjects extends BaseClass {
	
	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="(//a[text()='Configuration'])[2]")
	public WebElement configuration ;
	
	@FindBy(xpath="//a[text()='Reporting Methods']")
	public WebElement reoprts;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement add;
	
	@FindBy(xpath="//input[@name='reportingMethod[name]']")
	public WebElement name;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement save;

}
