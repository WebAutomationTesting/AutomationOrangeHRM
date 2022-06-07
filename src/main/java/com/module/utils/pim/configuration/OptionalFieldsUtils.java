package com.module.utils.pim.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.pim.configuration.OptionalFieldsObjects;

public class OptionalFieldsUtils extends BaseClass {
	
	SeleniumUtills seleniumUtills;
	SeleniumCore seleniumCore;
	OptionalFieldsObjects optionalfieldsobjects;
	
	public OptionalFieldsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		optionalfieldsobjects=PageFactory.initElements(driver,OptionalFieldsObjects.class);
		
	}
	 public void applicationlogin( String username,String password) {
		 
		 seleniumUtills.entertext(optionalfieldsobjects.username,username);
		 seleniumUtills.entertext(optionalfieldsobjects.password, password);
		 seleniumUtills.clickOnElement(optionalfieldsobjects.login);
		 seleniumUtills.clickOnElement(optionalfieldsobjects.PIM);
		 seleniumUtills.clickOnElement(optionalfieldsobjects.configuration);
		 seleniumUtills.clickOnElement(optionalfieldsobjects.optional);
		 
	 }

}
