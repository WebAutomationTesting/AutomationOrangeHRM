package com.module.utils.admin.usermanagement;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.usermanagement.UserspageObjects;


public class UserspageUtils extends BaseClass {

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public UserspageObjects userspageObjects;

	public UserspageUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		userspageObjects=PageFactory.initElements(driver,UserspageObjects.class);
	}
	
	public void enterUserName(String username) {
		seleniumUtills.entertext(userspageObjects.username,username);
	}
	
	public void selectUserRole() {
		seleniumUtills.clickOnElement(userspageObjects.userRole);
	}
	
	public void selectUserAdmin() {
		seleniumUtills.clickOnElement(userspageObjects.admin);
	}
	
	public void enterEmployeeName(String empName ) {
		seleniumUtills.entertext(userspageObjects.employeeName,empName);
	}
	
	public void seclectstatus() {
		seleniumUtills.clickOnElement(userspageObjects.status);
	}
	
	public void enterEnabled(String enabled) {
		seleniumUtills.entertext(userspageObjects.enabled,enabled);
	}
	

}
