package com.module.objects.admin.configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterOAuthClientObjects {

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	public WebElement admin;

	@FindBy(xpath ="//a[@id='menu_admin_Configuration']")
	public WebElement configuration;

	@FindBy(xpath = "//a[@id='menu_admin_registerOAuthClient']")
	public WebElement registeroauthclient;

	@FindBy(xpath = "//input[@id='oauth_client_id']")
	public WebElement id;

	@FindBy(xpath = "//input[@id='oauth_client_secret']")
	public WebElement secret;

	@FindBy(xpath = "//input[@id='oauth_redirect_uri']")
	public WebElement uri;

	@FindBy(xpath = "//input[@id='btnSave']" )
	public WebElement save;



}
