package com.module.utils.admin.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.admin.configuration.LanguagePackagesObjects;

public class LanguagePackagesUtils extends BaseClass {
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	WaitUtils wailUtils;
	LanguagePackagesObjects languagePackagesObjects;

	public  LanguagePackagesUtils() {
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		wailUtils=PageFactory.initElements(driver,WaitUtils.class);
		languagePackagesObjects=PageFactory.initElements(driver,LanguagePackagesObjects.class);
	}
	public void clickadmin() {
		seleniumUtills.clickOnElement(languagePackagesObjects.Admin);
	}
	public void clickconfiguration() {
		seleniumUtills.clickOnElement(languagePackagesObjects.configuration);
	}
	public void clicklanguage() {
		seleniumUtills.clickOnElement(languagePackagesObjects.languages);
	}
	public void clickedit() {
		seleniumUtills.clickOnElement(languagePackagesObjects.add);
	}
	public void selectLaunageDropdown(String laungage) {
		seleniumUtills.selectvisubleText(languagePackagesObjects.addlanguages, laungage);
	}
	public void clicksave() {
		seleniumUtills.clickOnElement(languagePackagesObjects.save);
	}

}




