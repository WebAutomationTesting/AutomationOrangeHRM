package com.module.utils.performance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.employeetrackers.EmployeeTrackersObjects;

public class EmployeeTrackersUtils extends BaseClass{
	SeleniumUtills seleniumUtills;
	SeleniumCore seleniumCore;
	EmployeeTrackersObjects employeeTrackersObjects;
	
	public EmployeeTrackersUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		employeeTrackersObjects=PageFactory.initElements(driver, EmployeeTrackersObjects.class);
	}
	
	public void applications(String username,String password) {
		seleniumUtills.entertext(employeeTrackersObjects.username, username);
		seleniumUtills.entertext(employeeTrackersObjects.password, password);
		seleniumUtills.clickOnElement(employeeTrackersObjects.login);
		seleniumUtills.clickOnElement(employeeTrackersObjects.Performance);
		seleniumUtills.clickOnElement(employeeTrackersObjects.Employetracker);
		
	}
	
	


}