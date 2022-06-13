package com.module.objects.admin.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class SocialMediaAuthenticationObjects extends BaseClass {
	
	@FindBy(xpath="//b[text()='Admin']")
	public WebElement Admin;

	@FindBy(id="menu_admin_Configuration")
	public WebElement  configuration;
	
	@FindBy(id="menu_admin_openIdProvider")
	public WebElement socialmedia;
	
	@FindBy(id="btnAdd")
	public WebElement add;
	
	@FindBy(id="openIdProvider_type")
	public WebElement type;
	
	@FindBy(xpath="//option[text()='Google']")
	public WebElement google;
	
	@FindBy(id="openIdProvider_name")
	public WebElement name;
	
	@FindBy(id="openIdProvider_url")
	public WebElement url;
	
	@FindBy(id="openIdProvider_clientId")
	public WebElement client;
	
	@FindBy(id="openIdProvider_clientSecret")
	public WebElement secret;
	
	@FindBy(id="openIdProvider_developerKey")
    public WebElement devkey;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	@FindBy(id="ohrmList_chkSelectRecord_1")
	public WebElement check;
	
	@FindBy(id="btnDelete")
	public WebElement delete;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement deleteok;
}
