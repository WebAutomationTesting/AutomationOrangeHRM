package com.module.objects.leave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyObjects {
	
	@FindBy(xpath="//b[text()='Leave']")
	public WebElement leaveHeader;

	@FindBy(xpath="//a[text()='Apply']")
	public WebElement applylink;

	
}
