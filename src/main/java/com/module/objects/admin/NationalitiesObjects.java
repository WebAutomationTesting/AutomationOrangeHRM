package com.module.objects.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NationalitiesObjects {
	
	@FindBy(id="menu_admin_nationality")
	public WebElement nationality;
	
	@FindBy(id="btnAdd")
	public WebElement add;
	
	@FindBy(id="nationality_name")
	public WebElement addNationalityName;
	
	@FindBy(id="btnSave")
	public WebElement save;
	

}
