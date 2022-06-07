package com.module.utils.pim.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.pim.configuration.CustomFieldsObjects;

public class CustomfieldsUtils extends BaseClass {

	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	CustomFieldsObjects customfieldsObjects;

	public CustomfieldsUtils() {

		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		customfieldsObjects=PageFactory.initElements(driver, CustomFieldsObjects.class);

	}

	public void selectPim() {
		seleniumUtills.clickOnElement(customfieldsObjects.PIM);
	}
	public void selectConfiguration() {
		seleniumUtills.clickOnElement(customfieldsObjects.configuration);
	}
	public void selectCustom() {
		seleniumUtills.clickOnElement(customfieldsObjects.custom);
	}
	public void selectAdd() {
		seleniumUtills.clickOnElement(customfieldsObjects.add);
	}
	public void enterFrom(String from) {
		seleniumUtills.entertext(customfieldsObjects.enter, from);
	}
	




}
