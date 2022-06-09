package com.module.utils.time.attendance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.time.attendance.MyRecordsObjects;

public class MyRecordsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public MyRecordsObjects myRecordsObjects;

	public MyRecordsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		myRecordsObjects=PageFactory.initElements(driver, MyRecordsObjects.class);

	}

	public void clickontime() {
		seleniumUtills.clickOnElement(myRecordsObjects.time);
	}

	public void clickonAttendenceRecords() {
		seleniumCore.clickOnSubmenu(myRecordsObjects.attendence,myRecordsObjects.myrecords);
	}

	public void myAttendencerecord() {
		waitUtils.waitTime(1000);
		seleniumUtills.clickOnElement(myRecordsObjects.myAttendencerecords);
	}

}