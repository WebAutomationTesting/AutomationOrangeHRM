package com.module.utils.pim.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.pim.configuration.TerminationReasonsObjects;

public class TerminationReasonsUtils extends BaseClass {
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	TerminationReasonsObjects terminationReasonsObjects;
	WaitUtils waitUtils;
	
	 public TerminationReasonsUtils() {
		 seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		 seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		 waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		 terminationReasonsObjects=PageFactory.initElements(driver,TerminationReasonsObjects.class);
	 }
	 public void clickOnPim() {
		 seleniumUtills.clickOnElement(terminationReasonsObjects.PIM);
	 }
	 public void clickOnCofiguration() {
		 seleniumUtills.clickOnElement(terminationReasonsObjects.configuration);
	 }
	 public void clickOnTermination() {
		 seleniumUtills.clickOnElement(terminationReasonsObjects.termination);
	 }
	 public void clickOnAdd() {
		 seleniumUtills.clickOnElement(terminationReasonsObjects.add);
	 }
		public void ClickOnUsername(String name) {
			seleniumUtills.entertext(terminationReasonsObjects.username, name);
		}
		public void clickOnSave() {
			seleniumUtills.clickOnElement(terminationReasonsObjects.save);
		}
	
		 
		 
	 

}
