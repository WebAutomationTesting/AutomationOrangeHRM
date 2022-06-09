package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.EmployeeListUtils;

public class EmployeeListScripts extends BaseClass {
	LoginLogoutpageUtils loginLogoutpageUtils;
	EmployeeListUtils employeeListUtils;
	UserspageUtils userspageUtils;
	WaitUtils waitUtils;
	
	@BeforeClass
	public void loadclass() {
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		employeeListUtils=PageFactory.initElements(driver, EmployeeListUtils.class);
		userspageUtils=PageFactory.initElements(driver, UserspageUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
		
	}
	@Test
	public void createUser() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		employeeListUtils.clickOnEmployeeList();
		employeeListUtils.employeeDetails("Harishra11", "", "Rayal", "777771", "", "", "", "", "");
		waitUtils.waitTime(1000);
		employeeListUtils.clickemployeelist();
		waitUtils.waitTime(1000);
		employeeListUtils.serach("Harishra11");
		employeeListUtils.secc();
		waitUtils.waitTime(1000);
		employeeListUtils.chechbox();
		waitUtils.waitTime(1000);
		employeeListUtils.delete();
		employeeListUtils.ok();
			
	}
	
		
		
		
		
	}


