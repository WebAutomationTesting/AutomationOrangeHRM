package com.module.utils.admin.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.configuration.RegisterOAuthClientObjects;

public class RegisterOAuthClientUtils extends BaseClass {
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	RegisterOAuthClientObjects registerOAuthClientObjects;

	public RegisterOAuthClientUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		registerOAuthClientObjects=PageFactory.initElements(driver, RegisterOAuthClientObjects.class);

	}
	public void selectadmin() {
		seleniumUtills.clickOnElement(registerOAuthClientObjects.admin);
	}
	public void selectconfiguration() {
		seleniumUtills.clickOnElement(registerOAuthClientObjects.configuration);
	}
	public void selectregisteroauthclient() {
		seleniumUtills.clickOnElement(registerOAuthClientObjects.registeroauthclient);
	}
	public void enterid( String id) {
		seleniumUtills.entertext(registerOAuthClientObjects.id, currDir);
	}
	public void entersecert(String secert) {
		seleniumUtills.entertext(registerOAuthClientObjects.secret, currDir);
	}
	public void enterredirecturi(String redirecturi) {
		seleniumUtills.entertext(registerOAuthClientObjects.uri, currDir);
	}
	public void selectsave() {
		seleniumUtills.clickOnElement(registerOAuthClientObjects.save);
	}

}
