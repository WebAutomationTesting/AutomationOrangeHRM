package com.module.objects.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutpageObjects {
	
	@FindBy(xpath = "//input[@name='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement pass;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	public WebElement login;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	public WebElement admin;
	
	@FindBy(xpath = "//a[text()='User Management']")
	public WebElement usermanagement;
	
	@FindBy(xpath = "//a[text()='Users']")
	public WebElement user;
	
	@FindBy(xpath = "//a[@id='welcome']")
	public WebElement tologout;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logout;


}




