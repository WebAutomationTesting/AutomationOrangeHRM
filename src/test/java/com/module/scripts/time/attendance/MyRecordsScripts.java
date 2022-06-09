package com.module.scripts.time.attendance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.time.attendance.MyRecordsUtils;

public class MyRecordsScripts extends BaseClass{
	LoginLogoutpageUtils loginLogoutpageUtils;
	WaitUtils waitUtils;
	MyRecordsUtils myRecordsUtils;
	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
        waitUtils=PageFactory.initElements(driver,WaitUtils.class);
        myRecordsUtils=PageFactory.initElements(driver, MyRecordsUtils.class);
}
	@Test
	public void myattendencerrecords() {
		loginLogoutpageUtils.applicationCredentials("Admin","admin123");
		myRecordsUtils.clickontime();
		myRecordsUtils.clickonAttendenceRecords();
		myRecordsUtils.myAttendencerecord();
		
	}
}