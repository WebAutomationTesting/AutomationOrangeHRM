package com.module.utils.leave;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.admin.usermanagement.UserspageObjects;
import com.module.objects.leave.AssignLeaveobjects;

public class AssignLeaveUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public AssignLeaveobjects assignLeaveobjects;
	UserspageObjects userspageObjects;

	public  AssignLeaveUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		assignLeaveobjects=PageFactory.initElements(driver, AssignLeaveobjects.class);
		userspageObjects=PageFactory.initElements(driver, UserspageObjects.class);
	}

	public void clickOnAssignleave() {
		seleniumCore.clickOnSubmenu(assignLeaveobjects.leaveHeader, assignLeaveobjects.assignleaveLink);

	}

	public void assignLeaveDetails(String empName,String leaveType,String fromDate,String toDate,String comment) {
		seleniumUtills.entertext(assignLeaveobjects.empName, empName);
		waitUtils.waitTime(1000);
		seleniumUtills.jsClick(userspageObjects.selectUser);
		seleniumUtills.selectvisubleText(assignLeaveobjects.leaveType,leaveType);
		seleniumUtills.entertext(assignLeaveobjects.fromDate, fromDate);
		seleniumUtills.entertext(assignLeaveobjects.toDate, toDate);
		seleniumUtills.entertext(assignLeaveobjects.comment, comment);

	}
	
	public void clickOnassign() {
		seleniumUtills.clickOnElement(assignLeaveobjects.assign);
	}
}
