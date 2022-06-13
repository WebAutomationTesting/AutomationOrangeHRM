package com.module.utils.buzz;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.buzz.BuzzObjects;

public class BuzzUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public BuzzObjects buzzObjects;

	public BuzzUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		buzzObjects=PageFactory.initElements(driver, BuzzObjects.class);
	}

	public void clickOnBuzz() {
		seleniumUtills.clickOnElement(buzzObjects.buzz);		
	}
	public void clickOnUpDateStatus() {
		seleniumUtills.clickOnElement(buzzObjects.upDateStatus);
	}
	public void enterTextStatus(String name) {
		seleniumUtills.entertext(buzzObjects.status, name);
	}
	public void clickOnPost() {
		seleniumUtills.clickOnElement(buzzObjects.post);
	}

}
