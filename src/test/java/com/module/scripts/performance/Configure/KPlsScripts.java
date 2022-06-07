package com.module.scripts.performance.Configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.performance.Configure.KPlsUtils;

public class KPlsScripts extends BaseClass{
	
	KPlsUtils KPlsUtils;

	@BeforeClass
	public void load() {
		
		KPlsUtils=PageFactory.initElements(driver, KPlsUtils.class);
	}
	
	@Test
	public void logincredentials() {
		
		KPlsUtils.apllications("Admin", "admin123");
	}

}
