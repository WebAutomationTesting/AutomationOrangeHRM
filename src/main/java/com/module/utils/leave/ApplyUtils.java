package com.module.utils.leave;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.leave.ApplyObjects;

public class ApplyUtils extends BaseClass{


	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public ApplyObjects applyObjects;


	public ApplyUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		applyObjects=PageFactory.initElements(driver, ApplyObjects.class);

	}

	public void clickOnApply() {
		seleniumCore.clickOnSubmenu(applyObjects.leaveHeader,applyObjects.applylink);
			
	}
	
	public void applyDetails() {
		seleniumUtills.clickOnElement(applyObjects.leaveHeader);
		seleniumUtills.clickOnElement(applyObjects.applylink);
		
	}
	
}
