package com.module.objects.pim.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class OptionalFieldsObjects extends BaseClass {
	
	@FindBy(xpath="//input[@name='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	public WebElement login;
	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="(//a[text()='Configuration'])[2]")
	public WebElement configuration ;
	
	@FindBy(xpath="//a[text()='Optional Fields']")
	public WebElement optional;
	
	
	
	


}
