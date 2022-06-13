package com.module.utils.leave;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.leave.MyLeaveobjects;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class MyLeaveUtils extends BaseClass{
	
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public MyLeaveobjects myLeaveobjects;
	
	public MyLeaveUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		myLeaveobjects=PageFactory.initElements(driver, MyLeaveobjects.class);
		
	}
	
	public void clickOnMyLeave() {
		seleniumCore.clickOnSubmenu(myLeaveobjects.leaveHeader, myLeaveobjects.myleaveLink);
		
	}
	
	public void myLeaveDetails(String fromDate,String toDate) {
		seleniumUtills.entertext(myLeaveobjects.fromDate, fromDate);
		seleniumUtills.entertext(myLeaveobjects.toDate, toDate);
		seleniumUtills.clickOnElement(myLeaveobjects.search);
	}

}
