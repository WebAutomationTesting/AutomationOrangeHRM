package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.configuration.ReportingMethodsUtils;

public class ReportingMethodsScripts extends BaseClass {
	
	ReportingMethodsUtils reportingMethodsUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	
	@BeforeClass
	public void load() {
		reportingMethodsUtils=PageFactory.initElements(driver,ReportingMethodsUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
	}
	@Test
	public void logincredits() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		reportingMethodsUtils.clickpim();
		reportingMethodsUtils.clickcon();
		reportingMethodsUtils.clickrep();
		reportingMethodsUtils.clickadd();
		reportingMethodsUtils.entername("Harishrayal");
		reportingMethodsUtils.clicksave();
		
	}

}
