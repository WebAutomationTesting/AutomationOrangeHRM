package com.module.objects.admin.usermanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserspageObjects {

	@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
	public WebElement username;
	
	@FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
	public WebElement userRole;
	
	@FindBy(xpath = "//option[text()='Admin']")
	public WebElement admin;
	
	@FindBy(xpath = "//input[@name='searchSystemUser[employeeName][empName]']")
	public WebElement employeeName;
	
	@FindBy(xpath = "//select[@name='searchSystemUser[status]']")
	public WebElement status;
	
	@FindBy(xpath = "//option[text()='Enabled']")
	public WebElement enabled;
	
	@FindBy(xpath = "//input[@name='_search']")
	public WebElement search;
	
	@FindBy(xpath = "//input[@value='Add']")
	public WebElement add;
	
	@FindBy(xpath = "//select[@name='systemUser[userType]']")
	public WebElement userroleSearch;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement employeename;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement userName;
	
	@FindBy(xpath = "//select[@name='systemUser[status]']")
	public WebElement statusName;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement password;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement save;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminHeader;
	
	@FindBy(id = "menu_admin_UserManagement")
	public WebElement userManagementMenu;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElement usersMenu;
	
	@FindBy(xpath="//li[@class='ac_even ac_over']")
	public WebElement selectUser;
	
	@FindBy(id="searchSystemUser_userName")
	public WebElement searchUsername;
	
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@FindBy(id="ohrmList_chkSelectRecord_64")
	public WebElement firstReocrd;
	
	@FindBy(id="btnDelete")
	public WebElement deleteButton;
	
	
	
	
}
