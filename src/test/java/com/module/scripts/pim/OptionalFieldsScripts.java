package com.module.scripts.pim;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utils.pim.configuration.OptionalFieldsUtils;

public class OptionalFieldsScripts extends BaseClass {
	
	OptionalFieldsUtils optionalFieldsUtils;
	
	
	@BeforeClass
	public void load() {
		optionalFieldsUtils=PageFactory.initElements(driver, OptionalFieldsUtils.class);
	}
	@Test
	public void logincredits() {
		optionalFieldsUtils.applicationlogin("Admin", "admin123");
	}

}
