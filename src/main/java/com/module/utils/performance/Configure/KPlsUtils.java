package com.module.utils.performance.Configure;

import java.util.Base64;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.Configure.KPlsObjects;

public class KPlsUtils extends BaseClass{
	
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	KPlsObjects kpisobjects;

	public KPlsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		kpisobjects=PageFactory.initElements(driver, KPlsObjects.class);
	}

	public void apllications(String username, String password) {
	
		seleniumUtills.clickOnElement(kpisobjects.Performance);
		seleniumUtills.clickOnElement(kpisobjects.Configure);
		seleniumUtills.clickOnElement(kpisobjects.KPIs);
		//seleniumUtills.clickOnElement(kpisobjects.All);
		seleniumUtills.clickOnElement(kpisobjects.QAEngineer);
		seleniumUtills.clickOnElement(kpisobjects.Search);
	}
}
