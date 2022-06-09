package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.ReportsUtils;

public class ReportsScripts extends BaseClass{
	
	LoginLogoutpageUtils  loginLogoutpageUtils;
	ReportsUtils reportsUtils;
	UserspageUtils userspageUtils;

	@BeforeClass
	public void loadClass() {	
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		reportsUtils=PageFactory.initElements(driver, ReportsUtils.class);
		userspageUtils=PageFactory.initElements(driver, UserspageUtils.class);
	}
	

	@Test
	public void createUser() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		reportsUtils.clickOnAddEmployee();
		reportsUtils.reports("Employee Contact info report", "","" , "", "harikishore", "", "", "");
		
	}
	

}
