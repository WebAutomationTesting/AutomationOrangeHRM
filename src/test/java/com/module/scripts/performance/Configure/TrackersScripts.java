package com.module.scripts.performance.Configure;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.performance.Configure.TrackersUtils;

public class TrackersScripts extends BaseClass{
	
	TrackersUtils trackersUtils;
	
	@BeforeClass
	public void load() {
		
		trackersUtils=PageFactory.initElements(driver, TrackersUtils.class);
	}
	
	@Test
	public void logincredentials() {
		
		trackersUtils.applications("Admin", "admin123");
	}

}
