package com.module.utils.admin.job;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.job.EmploymentStatusObjects;


public class EmploymentStatusUtils extends BaseClass {
	
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public EmploymentStatusObjects employmentStatusObjects;

	public EmploymentStatusUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		employmentStatusObjects=PageFactory.initElements(driver,EmploymentStatusObjects.class);
	}
	
	public void clickOnEmployment() {
		seleniumUtills.clickOnElement(employmentStatusObjects.employment);
	}
	
	public void clickOnEmploymentStatus() {
		seleniumUtills.clickOnElement(employmentStatusObjects.employmentStatus);
	}
	
	public void enterEmploymentStatusName(String employmentStatusName) {
		seleniumUtills.entertext(employmentStatusObjects.employmentStatusName,employmentStatusName);
	}
	
	public void clickOnSave() {
		seleniumUtills.clickOnElement(employmentStatusObjects.save);
	}
	
	public void clickOnPermanent() {
		seleniumUtills.clickOnElement(employmentStatusObjects.permanent);
	}
	
	public void clickOnAdd() {
		seleniumUtills.clickOnElement(employmentStatusObjects.add);
	}
	
}
