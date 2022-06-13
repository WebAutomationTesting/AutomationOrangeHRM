package com.module.utils.maintenance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.maintenance.accessrecords.AccessRecordsObjects;

public class AccessRecordsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public AccessRecordsObjects accessRecordsObjects;

	public AccessRecordsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		accessRecordsObjects=PageFactory.initElements(driver, AccessRecordsObjects.class);
	}
	public void clickOnMaitanance() {
		seleniumUtills.clickOnElement(accessRecordsObjects.maintanance);
	}
	public void clickOnAccess() {
		seleniumUtills.clickOnElement(accessRecordsObjects.accessRecord);
	}
	public void enterTextPassword(String name) {
		seleniumUtills.entertext(accessRecordsObjects.password, name);
	}
	public void clickOnVerify() {
		seleniumUtills.clickOnElement(accessRecordsObjects.verify);
	}

}
