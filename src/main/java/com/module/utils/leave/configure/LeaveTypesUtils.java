package com.module.utils.leave.configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.leave.configure.LeaveTypesObjects;

public class LeaveTypesUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public LeaveTypesObjects leaveTypesObjects;

	public LeaveTypesUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		leaveTypesObjects=PageFactory.initElements(driver, LeaveTypesObjects.class);

	}


	public void selectLeave() {
		seleniumUtills.clickOnElement(leaveTypesObjects.leave);

	}

	public void selectConfigure() {
		seleniumUtills.clickOnElement(leaveTypesObjects.configure);

	}

	public void selectLeaveTypes() {
		seleniumUtills.clickOnElement(leaveTypesObjects.leavetypes);

	}
	
	public void clickOnAdd() {
		seleniumUtills.clickOnElement(leaveTypesObjects.add);
		
	}
	
	public void enterText(String name) {
		seleniumUtills.entertext(leaveTypesObjects.name, name);
		
	}
	
	public void clickOnSave() {
		seleniumUtills.clickOnElement(leaveTypesObjects.save);
	}


}
