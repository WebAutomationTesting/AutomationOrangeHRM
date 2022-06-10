package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.configuration.RegisterOAuthClientUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class RegisterOAuthClientscripts extends BaseClass {

	RegisterOAuthClientUtils registerOAuthClientUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	@BeforeClass
	public void load() {
		registerOAuthClientUtils=PageFactory.initElements(driver, RegisterOAuthClientUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);
	}
	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationCredentials("admin", "admin123");
		registerOAuthClientUtils.selectadmin();
		registerOAuthClientUtils.selectconfiguration();
		registerOAuthClientUtils.selectregisteroauthclient();
		registerOAuthClientUtils.enterid("56789");
		registerOAuthClientUtils.entersecert("hari7036");
		registerOAuthClientUtils.enterredirecturi("girl654");
		registerOAuthClientUtils.selectsave();
	}

}
