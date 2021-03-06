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

	public void clickOnMonday() {
		seleniumUtills.clickOnElement(workWeekObjects.monday);
		
	}

	public void selectOnmondayFullday() {
		seleniumUtills.clickOnElement(workWeekObjects.mondayFullday);
		
	}
	
	public void clickOnTuesday() {
		seleniumUtills.clickOnElement(workWeekObjects.tuesday);

	}

	public void selectOntuesdayFullday() {
		seleniumUtills.clickOnElement(workWeekObjects.tuesdayFullday);
		
	}
	
	public void clickOnWednesday() {
		seleniumUtills.clickOnElement(workWeekObjects.wednesday);

	}

	public void selectOnwednesdayFullday() {
		seleniumUtills.clickOnElement(workWeekObjects.wednesdayFullday);
		
	}
	
	public void clickOnThursday() {
		seleniumUtills.clickOnElement(workWeekObjects.thursday);
		
	}
	
	public void selectOnthursdayFullday() {
		seleniumUtills.clickOnElement(workWeekObjects.thursdayFullday);
		
	}
	
	public void clickOnFriday() {
		seleniumUtills.clickOnElement(workWeekObjects.friday);
		
	}
	
	public void selectOnfridayFullday() {
		seleniumUtills.clickOnElement(workWeekObjects.fridayFullday);
		
	}
	
	public void clickOnSaturday() {
		seleniumUtills.clickOnElement(workWeekObjects.saturday);
		
	}
	
	public void selectOnsaturdayNonWorkingDay() {
		seleniumUtills.clickOnElement(workWeekObjects.saturdayNonWorkingDay);
		
	}
	
	public void clickOnSunday() {
		seleniumUtills.clickOnElement(workWeekObjects.sunday);
		
	}
	
	public void selectOnsundayNonWorkingDay() {
		seleniumUtills.clickOnElement(workWeekObjects.sundayNonWorkingDay);
	}
	

	public void clickOnSave() {
		seleniumUtills.clickOnElement(workWeekObjects.save);
	}
	
	
	
	
}
