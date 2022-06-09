package com.module.objects.admin.organization;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsObjects {
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement btnlogin;
	
	@FindBy(xpath = "//b[text()='Admin']")
	public WebElement Admin;
	
	@FindBy(xpath = "//a[text()='Organization']")
	public WebElement Organization;
	
	@FindBy(xpath = "//a[text()='Locations']+")
	public WebElement location ;
	
	@FindBy(xpath = "//input[@name='searchLocation[name]']")
	public WebElement name;
	
	@FindBy(xpath = "//input[@id='searchLocation_city']")
	public WebElement city;
	
	@FindBy(xpath = "//select[@name='searchLocation[country]']")
	public WebElement country;
	
	@FindBy(xpath = "//option[@value='AD']")
	public WebElement ad;
	
	

}
