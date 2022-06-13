package com.module.utils.leave;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.leave.LeaveListObjects;

public class LeaveListUtils extends BaseClass{
	
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public LeaveListObjects leaveListObjects;
	
	public  LeaveListUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		leaveListObjects=PageFactory.initElements(driver, LeaveListObjects.class);
		
	}

	public void clickOnLeaveList() {
		seleniumCore.clickOnSubmenu(leaveListObjects.leaveHeader, leaveListObjects.leavelistLink);
		
	}
	
	public void leaveListDetails(String fromDate,String toDate,String empName,String subUnit) {
		seleniumUtills.entertext(leaveListObjects.fromDate, fromDate);
		seleniumUtills.entertext(leaveListObjects.toDate,toDate);
		seleniumUtills.clickOnElement(leaveListObjects.allCheckbox);
		seleniumUtills.entertext(leaveListObjects.empName, empName);
		seleniumUtills.selectvisubleText(leaveListObjects.subUnit, subUnit);
		seleniumUtills.clickOnElement(leaveListObjects.search);
		
	}
}
