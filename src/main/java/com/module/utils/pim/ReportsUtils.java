package com.module.utils.pim;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.pim.ReportsObjects;

public class ReportsUtils extends BaseClass{
	
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public WaitUtils waitUtils;
	public ReportsObjects reportsObjects;
	
	public ReportsUtils( ) {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		reportsObjects=PageFactory.initElements(driver, ReportsObjects.class);
	}
	public void clickOnAddEmployee() {
		seleniumCore.clickOnSubmenu(reportsObjects.pimHeader, reportsObjects.reports);
	}
	
	public void reports(String reportname, String checkbox,String search,String add,String reportname1,String selectioncriteria,String selectedcriteriainclude,String displayfeildsgroups ) {
		seleniumUtills.entertext(reportsObjects.reportname,reportname1);
		seleniumUtills.clickOnElement(reportsObjects.checkbox);
		seleniumUtills.clickOnElement(reportsObjects.search);
		seleniumUtills.clickOnElement(reportsObjects.add);
		if (checkbox.isEmpty()!=true) {
			seleniumUtills.entertext(reportsObjects.reportname, reportname);
			seleniumUtills.clickOnElement(reportsObjects.employeecriteria);
			seleniumUtills.clickOnElement(reportsObjects.education);
			seleniumUtills.clickOnElement(reportsObjects.currentemployee);
			seleniumUtills.clickOnElement(reportsObjects.currentpastemployee);
			seleniumUtills.clickOnElement(reportsObjects.displayfeildgroups);
			seleniumUtills.clickOnElement(reportsObjects.language);
			seleniumUtills.clickOnElement(reportsObjects.displayfeilds);
			seleniumUtills.clickOnElement(reportsObjects.employeeid);
			seleniumUtills.clickOnElement(reportsObjects.save);
		}
				
		
	
	
	}
}
