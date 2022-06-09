package com.module.objects.performance.mytrackers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTrackersObjects {

	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement performance;

	@FindBy(xpath = "//a[text()='My Trackers']")
	public WebElement mytrackers;
}
