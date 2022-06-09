package com.module.objects.admin.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class LanguagePackagesObjects extends BaseClass {

	@FindBy(xpath="//b[text()='Admin']")
	public WebElement Admin;

	@FindBy(id="menu_admin_Configuration")
	public WebElement  configuration;

	@FindBy(id="menu_admin_languagePackage")
	public WebElement languages;

	@FindBy(id="btnAdd")
	public WebElement add;

	@FindBy(id="addLanguagePackage_name")
	public WebElement addlanguages;

	@FindBy(xpath="//option[text()='Aghem (Cameroon)']")
	public WebElement telugu;

	@FindBy(id="btnSave")
	public WebElement save;

}
