package com.module.utils.leave.entitlements;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.leave.entitlements.MyEntitlementsObjects;

public class MyEntitlementsUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public MyEntitlementsObjects myEntitlementsObjects;


	public MyEntitlementsUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		myEntitlementsObjects=PageFactory.initElements(driver, MyEntitlementsObjects.class);

	}
	public void clickOnMyEntitlements() {
		seleniumCore.clickOnSubSubmenu(myEntitlementsObjects.leaveHeader, myEntitlementsObjects.entitlementsSubHeader,myEntitlementsObjects.myEntitlementsLink);
		
	}
	public void selectOnLeaveType(String type) {
		seleniumUtills.selectvisubleText(myEntitlementsObjects.leaveType, type);
		
	}
	public void selectOnLeavePeriod(String period) {
		seleniumUtills.selectvisubleText(myEntitlementsObjects.leavePeriod, period);
		
	}
	public void clickOnSearch() {
		seleniumUtills.clickOnElement(myEntitlementsObjects.search);
		
	}
}
