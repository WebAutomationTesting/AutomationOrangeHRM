package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.utills.WaitUtils;
import com.module.utils.admin.configuration.SocialMediaAuthenticationUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class SocialMediaAuthenticationscripts extends BaseClass {
	LoginLogoutpageUtils loginLogoutpageUtils;
	WaitUtils waitUtils;
	SocialMediaAuthenticationUtils socialMediaAuthenticationUtils;
	@BeforeClass
	public void loadclass() {
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
		socialMediaAuthenticationUtils=PageFactory.initElements(driver,SocialMediaAuthenticationUtils.class);
		waitUtils=PageFactory.initElements(driver,WaitUtils.class);
	}
	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationCredentials("Admin", "admin123");
		socialMediaAuthenticationUtils.clickadmin();
		socialMediaAuthenticationUtils.clickcon();
		socialMediaAuthenticationUtils.clickonsocial();
		socialMediaAuthenticationUtils.clickonadd();
		socialMediaAuthenticationUtils.entertype("Google");
		socialMediaAuthenticationUtils.entername("Harish287", "https://opensource-demo.orangehrmlive.com/index.php/admin/openIdProvider", "141", "168", "189");
		socialMediaAuthenticationUtils.clicksave();
		waitUtils.waitTime(1000);
		socialMediaAuthenticationUtils.clickcheck();
		waitUtils.waitTime(1000);
		socialMediaAuthenticationUtils.clickdel();
		waitUtils.waitTime(1000);
		socialMediaAuthenticationUtils.clickok();
	}
}
