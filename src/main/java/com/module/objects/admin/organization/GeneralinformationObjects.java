package com.module.objects.admin.organization;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralinformationObjects {

	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement btnlogin;

	@FindBy(xpath = "//b[text()='Admin']")
	public WebElement Admin;

	@FindBy(xpath = "//a[@id='menu_admin_Organization']")
	public WebElement Organization;

	@FindBy(xpath = "//a[text()='General Information']")
	public WebElement General ;

	@FindBy(xpath = "//input[@id='btnSaveGenInfo']")
	public WebElement edit;

	@FindBy(id = "organization_name")
	public WebElement orangehrm  ;

	@FindBy(xpath = "//span[@id='numOfEmployees']")
	public WebElement numOfEmployees ;

	@FindBy(xpath = "//input[@id='organization_phone']")
	public WebElement phonenumber;

	@FindBy(xpath = "//input[@name='organization[email]']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='organization_taxId']")
	public WebElement taxId;

	@FindBy(xpath = "//input[@id='organization_registraionNumber']")
	public WebElement registraionNumber;

	@FindBy(xpath = "//input[@id='organization_fax']")
	public WebElement fax;

}




