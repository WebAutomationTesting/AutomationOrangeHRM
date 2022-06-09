package com.module.utils.time.timesheets;


import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.time.timesheets.MyTimeSheetsObjects;

public class MyTimeSheetsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	public MyTimeSheetsObjects myTimeSheetsObjects;

	public MyTimeSheetsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		myTimeSheetsObjects=PageFactory.initElements(driver, MyTimeSheetsObjects.class);
	}

	public void clickontime() {
		seleniumUtills.clickOnElement(myTimeSheetsObjects.time);
	}

	public void clickontimesheets() {
		seleniumUtills.clickOnElement(myTimeSheetsObjects.timesheets);
	}

	public void navigateMyTimesheet() {//mouse actions
		seleniumCore.clickOnSubmenu(myTimeSheetsObjects.timesheets, myTimeSheetsObjects.mytimesheet);
	}

	public void clickOnEditButton() {
		seleniumUtills.clickOnElement(myTimeSheetsObjects.editbutton);
	}

	public void enterProjectName(String name) {
		seleniumUtills.entertext(myTimeSheetsObjects.projectName, name);
		waitUtils.waitTime(1000);
		seleniumUtills.clickOnElement(myTimeSheetsObjects.selectProject);
	}

	public void selectonActivityname(int value) {
		waitUtils.waitTime(1000);
		seleniumUtills.selectIndexText(myTimeSheetsObjects.Activityname,value);
	}

	public void enterTimeondate(String date) {
		seleniumUtills.entertext(myTimeSheetsObjects.wednesday, date);

	}

	public void clickonsave() {
		seleniumUtills.clickOnElement(myTimeSheetsObjects.save);
	}


}