package com.module.utils.homepage;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.homepage.LoginLogoutpageObjects;

public class LoginLogoutpageUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	WaitUtils waitUtils;
	public LoginLogoutpageObjects loginLogoutpageObject;


	public LoginLogoutpageUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);
	}

	public void applicationCredentials(String username,String password) {
		seleniumUtills.entertext(loginLogoutpageObject.username,username);
		seleniumUtills.entertext(loginLogoutpageObject.pass,password);
		seleniumUtills.clickOnElement(loginLogoutpageObject.login);
	}

	public void clickOnAdmin() {
		seleniumUtills.clickOnElement(loginLogoutpageObject.admin);
	}

	public void clickOnUsermanagement() {
		seleniumUtills.clickOnElement(loginLogoutpageObject.usermanagement);
	}

	public void clickOnUser() {		
		seleniumUtills.clickOnElement(loginLogoutpageObject.user);

	}
	
	public void applicationlogout() {
		seleniumUtills.clickOnElement(loginLogoutpageObject.tologout);
		waitUtils.waitTime(500);
		seleniumUtills.clickOnElement(loginLogoutpageObject.logout);   	
	}


}
