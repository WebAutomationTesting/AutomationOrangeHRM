package com.module.scripts.leave.configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.leave.configure.WorkWeekUtils;

public class WorkWeekScripts extends BaseClass{
	
	WorkWeekUtils workWeekUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		
		workWeekUtils=PageFactory.initElements(driver, WorkWeekUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		
	}
	
	@Test
	public void LoginCredentials() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		workWeekUtils.selectLeave();
		workWeekUtils.selectConfigure();
		workWeekUtils.selectWokWeek();
		workWeekUtils.selectEdit();
		workWeekUtils.clickOnMonday();
		workWeekUtils.selectOnmondayFullday();
		workWeekUtils.clickOnTuesday();
		workWeekUtils.selectOntuesdayFullday();
		workWeekUtils.clickOnWednesday();
		workWeekUtils.selectOnwednesdayFullday();
		workWeekUtils.clickOnThursday();
		workWeekUtils.selectOnthursdayFullday();
		workWeekUtils.clickOnFriday();
		workWeekUtils.selectOnfridayFullday();
		workWeekUtils.clickOnSaturday();
		workWeekUtils.selectOnsaturdayNonWorkingDay();
		workWeekUtils.clickOnSunday();
		workWeekUtils.selectOnsaturdayNonWorkingDay();
		workWeekUtils.clickOnSave();
		
	}

}
