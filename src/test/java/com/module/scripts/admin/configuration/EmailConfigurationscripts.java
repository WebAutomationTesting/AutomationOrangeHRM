package com.module.scripts.admin.configuration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.admin.configuration.EmailConfigurationUtils;
import com.module.utils.homepage.LoginLogoutpageUtils;

public class EmailConfigurationscripts extends BaseClass {
	EmailConfigurationUtils emailConfigurationUtils;
	LoginLogoutpageUtils loginLogoutpageUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;

	@BeforeClass
	public void load( ) {
		emailConfigurationUtils=PageFactory.initElements(driver, EmailConfigurationUtils.class);
		loginLogoutpageUtils=PageFactory.initElements(driver, LoginLogoutpageUtils.class);
		loginLogoutpageObjects=PageFactory.initElements(driver, LoginLogoutpageObjects.class);

	}
	@Test
	public void logindetails() {
		loginLogoutpageUtils.applicationCredentials("admin", "admin123");
		emailConfigurationUtils.selectAdmin();
		emailConfigurationUtils.selectconfiguration();
		emailConfigurationUtils.selectemailconfiguration();
		emailConfigurationUtils.selectedit();
		emailConfigurationUtils.entermailsentas("hari@orangehrm.com");
		emailConfigurationUtils.selectcheckbox();
		emailConfigurationUtils.selectsendingmethod();
		emailConfigurationUtils.selecttestemailaddress();
		emailConfigurationUtils.selectsave();

	}

}
