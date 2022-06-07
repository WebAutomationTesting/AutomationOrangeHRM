package com.module.utils.leave.configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.leave.configure.WorkWeekObjects;

public class WorkWeekUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WorkWeekObjects workWeekObjects;

	public WorkWeekUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		workWeekObjects=PageFactory.initElements(driver, WorkWeekObjects.class);

	}

	public void selectLeave() {
		seleniumUtills.clickOnElement(workWeekObjects.leave);

	}

	public void selectConfigure() {
		seleniumUtills.clickOnElement(workWeekObjects.configure);

	}

	public void selectWokWeek() {
		seleniumUtills.clickOnElement(workWeekObjects.workweek);

	}

	public void selectEdit() {
		seleniumUtills.clickOnElement(workWeekObjects.edit);
	}
}
