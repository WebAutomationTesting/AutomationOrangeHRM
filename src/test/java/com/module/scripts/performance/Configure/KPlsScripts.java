package com.module.scripts.performance.Configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.performance.Configure.KPlsUtils;

public class KPlsScripts extends BaseClass{

	KPlsUtils kpisUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;

	@BeforeClass
	public void load() {
		kpisUtils=PageFactory.initElements(driver, KPlsUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
	}

	@Test
	public void KPIsdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		kpisUtils.clickonPerformance();
		kpisUtils.clickonConfigure();
		kpisUtils.clickonKPIs();
		kpisUtils.clickonQAEngineer();
		kpisUtils.clickonSearch();
		kpisUtils.clickonadD();
		kpisUtils.clickonSelect();
		kpisUtils.selectQAE();
		kpisUtils.entertextKeypermance("");
		kpisUtils.entertextMaximumRating("");
		kpisUtils.entertextMaximumRating("");
		kpisUtils.selectMakeDefaultScale();
		kpisUtils.clickonSaVe();
	}

}
