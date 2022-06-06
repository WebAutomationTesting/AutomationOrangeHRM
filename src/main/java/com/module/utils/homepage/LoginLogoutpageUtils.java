package com.module.utils.homepage;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.homepage.LoginLogoutpageObjects;

public class LoginLogoutpageUtils extends BaseClass{
	
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public LoginLogoutpageObjects loginLogoutpageObject;
	
	
	public LoginLogoutpageUtils() {
		
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);
				
	}
	
	public void applicationURL(String username,String password) {
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
    
    
	
}



