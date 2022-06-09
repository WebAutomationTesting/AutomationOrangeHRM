package com.module.objects.directory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class Directoryobjects extends BaseClass {

	@FindBy(xpath="//b[text()='Directory']")
	public WebElement directory;

	@FindBy(id="searchDirectory_emp_name_empName")
	public WebElement name;

	@FindBy(id="searchBtn")
	public WebElement search;

}
