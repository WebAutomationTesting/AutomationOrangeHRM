package com.module.utils.performance.Configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.Configure.TrackersObjects;

public class TrackersUtils extends BaseClass{
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	TrackersObjects trackersObjects;
	
	public TrackersUtils() {
		
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		trackersObjects=PageFactory.initElements(driver, TrackersObjects.class);
	
	}
	
	public void applications(String username, String password) {
		seleniumUtills.entertext(trackersObjects.username, username);
		seleniumUtills.entertext(trackersObjects.password, password);
		seleniumUtills.clickOnElement(trackersObjects.login);
		seleniumUtills.clickOnElement(trackersObjects.Performance);
		seleniumUtills.clickOnElement(trackersObjects.Configure);
		seleniumUtills.clickOnElement(trackersObjects.Trackers);
		seleniumUtills.clickOnElement(trackersObjects.Add);
		seleniumUtills.entertext(trackersObjects.TrackerName, username);
		seleniumUtills.entertext(trackersObjects.EmployeeName, username);
		seleniumUtills.clickOnElement(trackersObjects.lacky);
		seleniumUtills.clickOnElement(trackersObjects.ADD);
		seleniumUtills.clickOnElement(trackersObjects.Save);
		
	}

}
