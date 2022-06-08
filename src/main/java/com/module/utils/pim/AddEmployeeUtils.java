package com.module.utils.pim;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.pim.AddEmployeeobjects;

public class AddEmployeeUtils extends BaseClass {

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public WaitUtils waitUtils;
	public AddEmployeeobjects addEmployeeobjects;

	public AddEmployeeUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		addEmployeeobjects=PageFactory.initElements(driver,AddEmployeeobjects.class);
	}
	
	public void clickOnAddEmployee() {
		seleniumCore.clickOnSubmenu(addEmployeeobjects.pimHeader, addEmployeeobjects.addEmployeeLink);
	}
	
	public void addEmployeeDetails(String firstName,String middleName,String lastName,String empID,String photo,String checkbox,String username,String password,String confimpassword) {
		seleniumUtills.entertext(addEmployeeobjects.firstName, firstName);
		seleniumUtills.entertext(addEmployeeobjects.middleName, middleName);
		seleniumUtills.entertext(addEmployeeobjects.lastName, lastName);
		seleniumUtills.entertext(addEmployeeobjects.empID,empID);
		
		if (photo.isEmpty()!=true) {
			seleniumUtills.entertext(addEmployeeobjects.photo, photo);
		}
		
		if (checkbox.isEmpty()!=true) {
			seleniumUtills.clickOnElement(addEmployeeobjects.createLoginDetails);
			seleniumUtills.entertext(addEmployeeobjects.username, username);
			seleniumUtills.entertext(addEmployeeobjects.password, password);
			seleniumUtills.entertext(addEmployeeobjects.confirmPassword, confimpassword);
		}
				
		seleniumUtills.clickOnElement(addEmployeeobjects.saveButton);		
	}
	
	
	
	

}
