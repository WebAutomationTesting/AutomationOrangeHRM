package com.module.objects.admin.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobCategoriesObjects {
	
	@FindBy(id ="jobCategory_name")
	public WebElement categoryName;
	
	@FindBy(id ="menu_admin_Job")
	public WebElement jobLink;
	
	@FindBy(id="menu_admin_jobCategory")
	public WebElement jobCategory;
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement adminHeader;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logout;
	
	@FindBy(id="welcome")
	public WebElement welcomeButton;

}
