package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.admin.usermanagement.UserspageUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.AddEmployeeUtils;

public class AddEmployeeScripts extends BaseClass {

	LoginLogoutpageUtils  loginLogoutpageUtils;
	AddEmployeeUtils addEmployeeUtils;
	UserspageUtils userspageUtils;

	@BeforeClass
	public void loadClass() {	
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		addEmployeeUtils=PageFactory.initElements(driver, AddEmployeeUtils.class);
		userspageUtils=PageFactory.initElements(driver, UserspageUtils.class);
	}
	
	@AfterMethod
	public void logoutApplication() {
		loginLogoutpageUtils.applicationlogout();
	}

	@Test(priority =1)
	public void createUser() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		addEmployeeUtils.clickOnAddEmployee();
		addEmployeeUtils.addEmployeeDetails("RavinathB", "", "Bolluu", "", "","","","","");
		userspageUtils.clickOnUsersMenu();
		userspageUtils.clickOnAdd();
		userspageUtils.addUserDetails("Ravinath", "Ravinath123", "admin@123", "admin@123");
		userspageUtils.clickOnSave();	
	}
	
	@Test(priority =2)
	public void DeleteUser() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		userspageUtils.clickOnUsersMenu();
		userspageUtils.searchUsername("Ravinath");
		userspageUtils.clickOnDeleteUser();		
	}
	

}
