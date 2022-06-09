package com.module.utils.pim;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.pim.EmployeeListObjects;

public class EmployeeListUtils extends BaseClass {

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public WaitUtils waitUtils;
	public EmployeeListObjects employeeListObjects;

	public EmployeeListUtils() {
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		employeeListObjects=PageFactory.initElements(driver,EmployeeListObjects.class);
	}
	public void clickOnEmployeeList() {
		seleniumCore.clickOnSubmenu(employeeListObjects.pim, employeeListObjects.employee);
	}
	public void employeeDetails(String firstName,String middleName,String lastName,String empId,String photo,String checkbox,String username,String password,String confirmpassword) {
		seleniumUtills.entertext(employeeListObjects.firstname, firstName);
		seleniumUtills.entertext(employeeListObjects.middleName, middleName);
		seleniumUtills.entertext(employeeListObjects.lastname,lastName );
		seleniumUtills.entertext(employeeListObjects.empid, empId);
		if (photo.isEmpty()!=true) {
			seleniumUtills.entertext(employeeListObjects.photo,photo);
		}
		if (checkbox.isEmpty()!=true) {
			seleniumUtills.clickOnElement(employeeListObjects.check);
			seleniumUtills.entertext(employeeListObjects.username, username);
			seleniumUtills.entertext(employeeListObjects.password,password);
			seleniumUtills.entertext(employeeListObjects.confirmPassword, confirmpassword);
		}
		seleniumUtills.clickOnElement(employeeListObjects.save);

	}
	public void clickemployeelist() {
		seleniumUtills.clickOnElement(employeeListObjects.employe);
	}
	public void serach(String name) {
		seleniumUtills.entertext(employeeListObjects.search, name);
	}
    public void secc() {
    	seleniumUtills.clickOnElement(employeeListObjects.searc1);
    }
    public void chechbox() {
    	seleniumUtills.clickOnElement(employeeListObjects.check1);
    }
    public void delete() {
    	seleniumUtills.clickOnElement(employeeListObjects.delete);
    }
    public void ok() {
    	seleniumUtills.clickOnElement(employeeListObjects.ok);
    }
    
    }



