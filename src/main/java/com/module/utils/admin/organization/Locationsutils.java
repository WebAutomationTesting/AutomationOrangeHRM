package com.module.utils.admin.organization;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;

public class Locationsutils  extends BaseClass{
	private static final WebElement username = null;
	private static final WebElement password = null;
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	Locationsutils locationsutils;
	
	public Locationsutils( ) {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		locationsutils=PageFactory.initElements(driver, Locationsutils.class);
	}
	
	public void applicationlogin(String username,String password) {
		
	}
 public void enterusername(String username) {
	 seleniumUtills.entertext(locationsutils.username, username);
	 
 }
 public void enterpassword(String password) {
	 seleniumUtills.entertext(locationsutils.password, password);
 }
 public void clickonelement() {
	
 }
 
	

 
}

