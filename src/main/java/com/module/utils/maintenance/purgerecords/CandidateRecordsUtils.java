package com.module.utils.maintenance.purgerecords;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.maintenance.purgerecords.CandidateRecordsObjects;

public class CandidateRecordsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public CandidateRecordsObjects candidateRecordsObjects;

	public CandidateRecordsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		candidateRecordsObjects=PageFactory.initElements(driver, CandidateRecordsObjects.class);
	}

	public void clickOnMaitanance() {
		seleniumUtills.clickOnElement(candidateRecordsObjects.maintanance);
	}
	public void clickOnPurgeRecords() {
		seleniumUtills.clickOnElement(candidateRecordsObjects.purgeEmployee);
		seleniumUtills.clickOnElement(candidateRecordsObjects.candidate);
	}
	public void enterTextPassword(String name) {
		seleniumUtills.entertext(candidateRecordsObjects.password, name);
	}
	public void clickOnVerify() {
		seleniumUtills.clickOnElement(candidateRecordsObjects.verify);
	}

}
