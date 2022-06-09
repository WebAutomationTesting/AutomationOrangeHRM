package com.module.utils.pim.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.pim.configuration.ReportingMethodsObjects;

public class ReportingMethodsUtils extends BaseClass {
	
	SeleniumUtills seleniumUtills;
	SeleniumCore seleniumCore;
	ReportingMethodsObjects reportingMethodsObjects;
	
	public ReportingMethodsUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		reportingMethodsObjects=PageFactory.initElements(driver,ReportingMethodsObjects.class);
	}
	public void clickpim() {
		seleniumUtills.clickOnElement(reportingMethodsObjects.PIM);
	}
	public void clickcon() {
		seleniumUtills.clickOnElement(reportingMethodsObjects.configuration);
	}
	public void clickrep() {
		seleniumUtills.clickOnElement(reportingMethodsObjects.reoprts);
	}
	public void clickadd() {
		seleniumUtills.clickOnElement(reportingMethodsObjects.add);
	}
	public void entername(String name) {
		seleniumUtills.entertext(reportingMethodsObjects.name, name);
	}
	public void clicksave() {
		seleniumUtills.clickOnElement(reportingMethodsObjects.save);
	}
	

}
