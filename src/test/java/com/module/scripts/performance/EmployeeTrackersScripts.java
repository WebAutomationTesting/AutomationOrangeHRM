package com.module.scripts.performance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.performance.EmployeeTrackersUtils;

public class EmployeeTrackersScripts extends BaseClass{
	
	EmployeeTrackersUtils employeeTrackersUtils;
	
	@BeforeClass
	public void loan() {
		employeeTrackersUtils=PageFactory.initElements(driver, EmployeeTrackersUtils.class);
	}
	
	@Test
	public void logincredentials() {
		//employeeTrackersUtils.applications("Admin", "admin123");
	}
	

}
