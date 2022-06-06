package com.module.scripts.admin.usermanagement;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class UsersScripts extends BaseClass {

	UserspageUtils userspageUtils;
	LoginLogoutpageObjects loginLogoutpageObject;
	LoginLogoutpageUtils  loginLogoutpageUtils;

	@BeforeClass
	public void load() {
		userspageUtils=PageFactory.initElements(driver,UserspageUtils.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObjects.class);	
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
	}

	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationURL("Admin","admin123");
		userspageUtils.enterUserName("yedu");
		userspageUtils.selectUserRole();
		userspageUtils.selectUserAdmin();
		userspageUtils.enterEmployeeName("yedukondaluNarsing");
		userspageUtils.seclectstatus();
		userspageUtils.enterEnabled("enabled");
	}


}
