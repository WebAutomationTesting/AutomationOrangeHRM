package com.module.utils.admin.usermanagement;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.admin.usermanagement.UserspageObjects;


public class UserspageUtils extends BaseClass {

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	WaitUtils waitUtils;
	public UserspageObjects userspageObjects;

	public UserspageUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		userspageObjects=PageFactory.initElements(driver,UserspageObjects.class);
	}
	
	public void clickOnUsersMenu() {
		seleniumCore.clickOnSubSubmenu(userspageObjects.adminHeader, userspageObjects.userManagementMenu,userspageObjects.usersMenu);
	}
	
	public void enterUserName(String username) {
		seleniumUtills.entertext(userspageObjects.username,username);
	}
	
	public void selectUserRole() {
		seleniumUtills.clickOnElement(userspageObjects.userRole);
	}
	
	public void selectUserAdmin() {
		seleniumUtills.clickOnElement(userspageObjects.admin);
	}
	
	public void enterEmployeeName(String empName ) {
		seleniumUtills.entertext(userspageObjects.employeeName,empName);
	}
	
	public void selectStatus() {
		seleniumUtills.clickOnElement(userspageObjects.status);
	}
	
	public void selectEnabled() {
		seleniumUtills.clickOnElement(userspageObjects.enabled);
	}
	
	public void clickOnSearch() {
		seleniumUtills.clickOnElement(userspageObjects.search);
	}
	
	public void clickOnAdd() {
		seleniumUtills.clickOnElement(userspageObjects.add);
	}
	
	public void selectuserRoleSearch() {
		seleniumUtills.clickOnElement(userspageObjects.userroleSearch);
	}
	
	public void enterEmployeename(String empName ) {
		seleniumUtills.entertext(userspageObjects.employeename,empName);
	}
	
	public void enterDetailsUserName(String userName ) {
		seleniumUtills.entertext(userspageObjects.userName,userName);
	}
	
	public void clickOnStatusName() {
		seleniumUtills.clickOnElement(userspageObjects.statusName);
	}
	
	public void enterPassword(String password ) {
		seleniumUtills.entertext(userspageObjects.password,password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		seleniumUtills.entertext(userspageObjects.confirmPassword,confirmPassword);
	}
	
	public void clickOnSave() {
		seleniumUtills.clickOnElement(userspageObjects.save);
	}
	
	public void addUserDetails(String empName,String userName,String password,String confirmPassword) {
		seleniumUtills.entertext(userspageObjects.employeename,empName);
		waitUtils.waitTime(500);
		seleniumUtills.clickOnElement(userspageObjects.selectUser);
		seleniumUtills.entertext(userspageObjects.userName,userName);
		seleniumUtills.entertext(userspageObjects.password,password);
		seleniumUtills.entertext(userspageObjects.confirmPassword,confirmPassword);
	}
	
	public void searchUsername(String username) {
		seleniumUtills.entertext(userspageObjects.searchUsername,username);
		seleniumUtills.clickOnElement(userspageObjects.searchButton);
	}
	
	public void clickOnDeleteUser() {
		seleniumUtills.clickOnElement(userspageObjects.firstReocrd);
		seleniumUtills.clickOnElement(userspageObjects.deleteButton);
	}
	

}
