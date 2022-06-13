package com.module.utils.leave.entitlements;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.leave.entitlements.AddEntitlementsObjects;

public class AddEntitlementsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public AddEntitlementsObjects addEntitlementsObjects;

	public  AddEntitlementsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		addEntitlementsObjects=PageFactory.initElements(driver, AddEntitlementsObjects.class);

	}

	public void clickOnAddEntitlements() {
		seleniumCore.clickOnSubSubmenu(addEntitlementsObjects.leaveHeader,addEntitlementsObjects.entitlementsSubHeader, addEntitlementsObjects.addEntitlementsLink);

	}

	public void clickOnEmpName(String empName) {
		seleniumUtills.entertext(addEntitlementsObjects.empName, empName);
	}
	
		
		public void selectOnLeavetype(String type) {
			seleniumUtills.selectvisubleText(addEntitlementsObjects.leaveType, type);
		}
		public void selectOnLeaveperiod(String Period) {
			seleniumUtills.selectvisubleText(addEntitlementsObjects.leavePeriod, Period);
		}
		public void enterEntitlement(String entitlement) {
			seleniumUtills.entertext(addEntitlementsObjects.entitlements, entitlement);
		}
		public void clicksave() {
			seleniumUtills.clickOnElement(addEntitlementsObjects.save);
		}
		
	


		
	
}