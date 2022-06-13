package com.module.scripts.buzz;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.buzz.BuzzUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class BuzzScript extends BaseClass{

	LoginLogoutpageUtils loginLogoutpageUtils;
	BuzzUtils buzzUtils;
	WaitUtils waitUtils;

	@BeforeClass
	public void load() {
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		buzzUtils=PageFactory.initElements(driver, BuzzUtils.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
	}

	@Test
	public void Buzzdetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		buzzUtils.clickOnBuzz();
		buzzUtils.clickOnUpDateStatus();
		waitUtils.waitTime(500);
		buzzUtils.enterTextStatus("Nice");
		buzzUtils.clickOnPost();
	}

}
