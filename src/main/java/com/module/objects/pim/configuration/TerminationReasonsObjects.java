package com.module.objects.pim.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class TerminationReasonsObjects extends BaseClass {
	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="(//a[text()='Configuration'])[2]")
	public WebElement configuration ;
	
	@FindBy(xpath="//a[text()='Termination Reasons']")
	public WebElement termination;
	
	@FindBy(id="btnAdd")
	public WebElement add;
	
	@FindBy(id="terminationReason_name")
	public WebElement username;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	
	

}
