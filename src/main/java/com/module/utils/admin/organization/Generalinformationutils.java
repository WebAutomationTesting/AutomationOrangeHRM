package com.module.utils.admin.organization;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.organization.GeneralinformationObjects;

public class Generalinformationutils extends BaseClass {
	
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	GeneralinformationObjects generalinformationObjects;
	
	public Generalinformationutils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		generalinformationObjects=PageFactory.initElements(driver, GeneralinformationObjects.class);
	}
	
	public void applicationlogin(String username,String password) {
		
	}
	
	public void selectusername() {
		seleniumUtills.clickOnElement(generalinformationObjects.username);
		
	}
		public void selectUserAdmin() {
			//seleniumUtills.clickOnElement();
		}
		
	public void clickonOrganization() {
		seleniumUtills.clickOnElement(generalinformationObjects.Organization);
	}
	
	
	
	
	public void login(String enter) {
		seleniumUtills.entertext(generalinformationObjects.orangehrm, enter);
	}
	
	
}
	
	
	
	
	


