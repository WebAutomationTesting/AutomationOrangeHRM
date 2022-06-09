package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.configuration.TerminationReasonsUtils;

public class TerminationReasonsScripts extends BaseClass {
	
	LoginLogoutpageUtils loginLogoutpageUtils;
	TerminationReasonsUtils terminationReasonsUtils;
	
	@BeforeClass
	public void loadClass() {
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		terminationReasonsUtils=PageFactory.initElements(driver,TerminationReasonsUtils.class);
	}
	@Test
	public void logincredits() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		terminationReasonsUtils.clickOnPim();
		terminationReasonsUtils.clickOnCofiguration();
		terminationReasonsUtils.clickOnTermination();
		terminationReasonsUtils.clickOnAdd();
		terminationReasonsUtils.ClickOnUsername("Harish");
		terminationReasonsUtils.clickOnSave();
	}

}
