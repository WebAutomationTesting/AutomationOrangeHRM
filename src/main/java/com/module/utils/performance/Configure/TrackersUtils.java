package com.module.utils.performance.Configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.Configure.TrackersObjects;

public class TrackersUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public TrackersObjects trackersObjects;

	public TrackersUtils() {
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		trackersObjects=PageFactory.initElements(driver, TrackersObjects.class);

	}

	public void clickonPerformance() {
		seleniumUtills.clickOnElement(trackersObjects.performance);
	}
	public void clickonConfigure() {
		seleniumUtills.clickOnElement(trackersObjects.configure);
	}
	public void clickonTrackers() {
		seleniumUtills.clickOnElement(trackersObjects.trackers);
	}
	public void clickonAdd() {
		seleniumUtills.clickOnElement(trackersObjects.add);
	}
	public void entertextTrackname(String name) {
		seleniumUtills.entertext(trackersObjects.trackerName, "");
	}
	public void clickonEmployeeName() {
		seleniumUtills.clickOnElement(trackersObjects.employeeName);
	}
	public void clickonOrangeTest() {
		seleniumUtills.clickOnElement(trackersObjects.orangetest);
	}
	public void clickonadD() {
		seleniumUtills.clickOnElement(trackersObjects.adD);
	}

	public void clickonElementSave() {
		seleniumUtills.clickOnElement(trackersObjects.sAve);

	}

}
