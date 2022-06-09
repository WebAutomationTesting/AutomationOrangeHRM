package com.module.objects.admin.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailConfigurationObjects {
	
	@FindBy(xpath = "//b[text()='Admin']")
	public WebElement Admin;
	
	@FindBy(xpath = "//a[@id='menu_admin_Configuration']")
	public WebElement Configuration;
	
	@FindBy(xpath = "//a[text()='Email Configuration']")
	public WebElement emailconfirguration;
	
	@FindBy(xpath = "//input[@id='editBtn']")
	public WebElement edit;
	
	@FindBy(id = "emailConfigurationForm_txtMailAddress")
	public WebElement MailSentAs ;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkbox;
	
	@FindBy(xpath = "//select[@id='emailConfigurationForm_cmbMailSendingMethod']")
	public WebElement sendingmethod;
	
	@FindBy(xpath = "//option[@value='sendmail']")
	public WebElement sendmail;
	
	@FindBy(xpath = "//input[@id='emailConfigurationForm_txtTestEmail']")
	public WebElement testmail;
	
	@FindBy(xpath = "//input[@id='editBtn']")
	public WebElement save;

}
