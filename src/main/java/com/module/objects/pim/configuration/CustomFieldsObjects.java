package com.module.objects.pim.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class CustomFieldsObjects extends BaseClass {



	@FindBy(xpath="//b[text()='PIM']")
	public WebElement PIM;

	@FindBy(xpath="(//a[text()='Configuration'])[2]")
	public WebElement configuration ;

	@FindBy(xpath="//a[text()='Custom Fields']")
	public WebElement custom;

	@FindBy(xpath="//input[@value='Add']")
	public WebElement add;

	@FindBy(xpath="(//input[@type='text'])[1]")
	public WebElement enter;

	@FindBy(xpath="//select[@class='valid']")
	public WebElement job;




}
