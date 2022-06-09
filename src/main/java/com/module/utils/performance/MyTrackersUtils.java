package com.module.utils.performance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.mytrackers.MyTrackersObjects;

public class MyTrackersUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public MyTrackersObjects myTrackersObjects;

	public MyTrackersUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		myTrackersObjects=PageFactory.initElements(driver, MyTrackersObjects.class);
	}

	public void clickonPerformance() {
		seleniumUtills.clickOnElement(myTrackersObjects.performance);
	}
	public void clickonmytrackers() {
		seleniumUtills.clickOnElement(myTrackersObjects.mytrackers);
	}
}