package com.module.utils.leave.configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.leave.configure.LeavePeriodObjects;
import com.module.objects.leave.configure.LeaveTypesObjects;

public class LeavePeriodUtils extends BaseClass{
	

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	WaitUtils waitUtils;
	public LeavePeriodObjects leavePeriodObjects;

	public LeavePeriodUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		leavePeriodObjects=PageFactory.initElements(driver, LeavePeriodObjects.class);
	
	}
	
	public void clickOnLeaveperiod() {
		seleniumCore.clickOnSubSubmenu(leavePeriodObjects.leaveMenu,leavePeriodObjects.configuresubMenu,leavePeriodObjects.leaveperiodsubsubMenu);
			
	}
	
	public void leavePeriodDetails() {
		seleniumUtills.clickOnElement(leavePeriodObjects.edit);
	}
	
		
		public void selectStartMonth(String startMonth) {
			seleniumUtills.selectvisubleText(leavePeriodObjects.month, startMonth);
		}
		public void selectdate(String date) {
			seleniumUtills.selectvisubleText(leavePeriodObjects.date, date);
		}
		public void save() {
			seleniumUtills.clickOnElement(leavePeriodObjects.save);
		}
			
		
		
		
	
}

