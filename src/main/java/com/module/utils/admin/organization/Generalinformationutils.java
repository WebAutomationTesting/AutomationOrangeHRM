package com.module.utils.admin.organization;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.organization.GeneralinformationObjects;

public class Generalinformationutils extends BaseClass {
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	GeneralinformationObjects generalinformationObjects;

	public Generalinformationutils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		generalinformationObjects=PageFactory.initElements(driver, GeneralinformationObjects.class);
	}
	public void selectUserAdmin() {
		seleniumUtills.clickOnElement(generalinformationObjects.Admin);
	}
	public void selectorganization() {
		seleniumUtills.clickOnElement(generalinformationObjects.Organization);
	}
	public void selectgeneralinfo() { 
		seleniumUtills.clickOnElement(generalinformationObjects.General);
	}

	public void selectedit() {
		seleniumUtills.clickOnElement(generalinformationObjects.edit);
	}

	public void enterorganizationname(String organization) {
		seleniumUtills.entertext(generalinformationObjects.orangehrm,organization);
	}

	public void enternumberofemployees( String numberofemployees) {
		seleniumUtills.entertext(generalinformationObjects.numOfEmployees,numberofemployees);
	}
	public void enterPhonenumber(String phonenumber) {
		seleniumUtills.entertext(generalinformationObjects.phonenumber,phonenumber );
	}

	public void enteremail( String email) {
		seleniumUtills.entertext(generalinformationObjects.email, email);
	}
	public void entertaxid( String taxid) {
		seleniumUtills.entertext(generalinformationObjects.taxId,taxid);
	}
	public void enterregistraionNumber( String registraionnumber) {
		seleniumUtills.entertext(generalinformationObjects.registraionNumber, registraionnumber);
	}
	public void enterfax(String fax ) {
		seleniumUtills.entertext(generalinformationObjects.fax, fax);
	}


}
