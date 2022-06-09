package com.module.utils.time.attendance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.maintenance.purgerecords.EmployeeRecordsObjects;

public class EmployeeRecordsUtils extends BaseClass{
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
    EmployeeRecordsObjects employeeRecordsObjects;
    
    public EmployeeRecordsUtils() {
    	seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		employeeRecordsObjects=PageFactory.initElements(driver, EmployeeRecordsObjects.class);
    }
    
    public void clickOnTime() {
    
}
}