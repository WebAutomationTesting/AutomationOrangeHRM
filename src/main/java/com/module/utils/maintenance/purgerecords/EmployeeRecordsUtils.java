package com.module.utils.maintenance.purgerecords;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.maintenance.purgerecords.EmployeeRecordsObjects;

public class EmployeeRecordsUtils extends BaseClass{
	
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public EmployeeRecordsObjects employeeRecordsObjects;
	
	public EmployeeRecordsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		employeeRecordsObjects=PageFactory.initElements(driver, EmployeeRecordsObjects.class);
	}
	public void clickOnMaitanance() {
		seleniumUtills.clickOnElement(employeeRecordsObjects.maintanance);
	}
	public void clickOnPurgueRecords() {
		seleniumUtills.clickOnElement(employeeRecordsObjects.purgeEmployee);
		seleniumUtills.clickOnElement(employeeRecordsObjects.employeeRecord);
	}
	public void enterTextVerifyPassword(String name) {
		seleniumUtills.entertext(employeeRecordsObjects.password, name);
	}
	public void clickOnVerify() {
		seleniumUtills.clickOnElement(employeeRecordsObjects.verify);
	}

}
