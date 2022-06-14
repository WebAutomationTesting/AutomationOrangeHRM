package com.module.utils.leave.entitlements;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.leave.entitlements.EmployeeEntitlementsObjects;

public class EmployeeEntitlementsUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public EmployeeEntitlementsObjects employeeEntitlementsObjects;


	public EmployeeEntitlementsUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		employeeEntitlementsObjects=PageFactory.initElements(driver, EmployeeEntitlementsObjects.class);

	}
	public void clickOnEmployeeEntitlements() {
		seleniumCore.clickOnSubSubmenu(employeeEntitlementsObjects.leaveHeader, employeeEntitlementsObjects.entitlementsSubHeader,employeeEntitlementsObjects.employeeEntitlementsLink);

	}
	public void clickOnEmployeeName(String employeeName) {
		seleniumUtills.entertext(employeeEntitlementsObjects.employeeName,employeeName);

	}
	public void selectOnLeaveType(String type) {
		seleniumUtills.selectvisubleText(employeeEntitlementsObjects.leaveType, type);
		
	}
	public void selectOnLeavePeriod(String period) {
		seleniumUtills.selectvisubleText(employeeEntitlementsObjects.leavePeriod, period);
		
	}

	public void clickOnSearch() {
		seleniumUtills.clickOnElement(employeeEntitlementsObjects.search);
	}
	
}


