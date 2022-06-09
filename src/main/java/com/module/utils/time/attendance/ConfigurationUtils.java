package com.module.utils.time.attendance;


import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.time.attendance.ConfigurationObjects;


public class ConfigurationUtils extends BaseClass{
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public ConfigurationObjects configurationObjects;

	public ConfigurationUtils() {

		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		configurationObjects=PageFactory.initElements(driver, ConfigurationObjects.class);
	}
	public void clickontime() {
		seleniumUtills.clickOnElement(configurationObjects.time);
	}
	public void clickonattendence() {
		seleniumUtills.clickOnElement(configurationObjects.attendence);
	}
	public void clickonconfiguration() {
		seleniumUtills.clickOnElement(configurationObjects.configuration);
	}
	public void clickonattendenceconfiguration1() {
		seleniumUtills.clickOnElement(configurationObjects.attendenceconfiguration1);
	}
	public void clickonattendenceconfiguration2() {
		seleniumUtills.clickOnElement(configurationObjects.attendenceconfiguration2);
	}
	public void clickonattendenceconfiguration3() {
		seleniumUtills.clickOnElement(configurationObjects.attendenceconfiguration3);
	}
	public void clickonsave() {
		seleniumUtills.clickOnElement(configurationObjects.save);
	}
}