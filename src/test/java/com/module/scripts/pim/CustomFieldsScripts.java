package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObjects;
import com.module.utils.homepage.LoginLogoutpageUtils;
import com.module.utils.pim.configuration.CustomfieldsUtils;


public class CustomFieldsScripts extends BaseClass {

	CustomfieldsUtils customfieldsUtils;
	LoginLogoutpageObjects loginLogoutpageObjects;
	LoginLogoutpageUtils loginLogoutpageUtils;

	@BeforeClass
	public void data() {
		customfieldsUtils=PageFactory.initElements(driver,CustomfieldsUtils.class );
		loginLogoutpageObjects=PageFactory.initElements(driver,LoginLogoutpageObjects.class);
		loginLogoutpageUtils=PageFactory.initElements(driver,LoginLogoutpageUtils.class);
	}

	@Test
	public void logincredits() {
		loginLogoutpageUtils.applicationURL("Admin", "admin123");
		customfieldsUtils.selectPim();
		customfieldsUtils.selectConfiguration();
		customfieldsUtils.selectCustom();
		customfieldsUtils.selectAdd();
		customfieldsUtils.enterFrom("Harish");
		customfieldsUtils.selectdropdown();
		customfieldsUtils.selectjob();
		customfieldsUtils.selectddown();
		customfieldsUtils.selectdrdown();
		customfieldsUtils.enteroption("Hari");
		customfieldsUtils.save();
	}
}
