package com.module.utils.performance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.employeetrackers.EmployeeTrackersObjects;

public class EmployeeTrackersUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public EmployeeTrackersObjects employeeTrackersObjects;

	public EmployeeTrackersUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		employeeTrackersObjects=PageFactory.initElements(driver, EmployeeTrackersObjects.class);
	}

	public void clickonElementPerformance(){
		seleniumUtills.clickOnElement(employeeTrackersObjects.Performance);
	}
	public void clickonEmployetracker() {
		seleniumUtills.clickOnElement(employeeTrackersObjects.Employetracker);

	}




}