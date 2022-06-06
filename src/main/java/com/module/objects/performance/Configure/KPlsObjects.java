package com.module.objects.performance.Configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KPlsObjects {

	@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
	public WebElement username;
	
	@FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
	public WebElement userRole;
	
	@FindBy(xpath = "")
	public WebElement updated;
	
	
}
