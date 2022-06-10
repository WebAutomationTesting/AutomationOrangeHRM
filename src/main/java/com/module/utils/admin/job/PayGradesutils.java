package com.module.utils.admin.job;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.job.PayGradesObjects;


public class PayGradesutils extends BaseClass {

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public PayGradesObjects payGradesObjects;

	public PayGradesutils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		payGradesObjects=PageFactory.initElements(driver,PayGradesObjects.class);
	}

	public void clickOnJob() {
		seleniumUtills.clickOnElement(payGradesObjects.job);
	}

	public void clickOnPayGrades() {
		seleniumUtills.clickOnElement(payGradesObjects.payGrades);
	}

	public void clickOnADD() {
		seleniumUtills.clickOnElement(payGradesObjects.add);
	}

	public void enterName(String name) {
		seleniumUtills.entertext(payGradesObjects.name,name);
	}

	public void clickOnSave() {
		seleniumUtills.clickOnElement(payGradesObjects.save);
	}

	public void enterCurrency(String currency) {
		seleniumUtills.entertext(payGradesObjects.currency,currency);
	}

	public void enterMinSalary(String minSalary) {
		seleniumUtills.entertext(payGradesObjects.minSalary,minSalary);
	}

	public void enterMaxSalary(String maxSalary) {
		seleniumUtills.entertext(payGradesObjects.maxSalary,maxSalary);
	}

}
