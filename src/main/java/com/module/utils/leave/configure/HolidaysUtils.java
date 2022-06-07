package com.module.utils.leave.configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.leave.configure.HolidaysObjects;

public class HolidaysUtils extends BaseClass{


	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public HolidaysObjects holidaysObjects;


	public HolidaysUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		holidaysObjects=PageFactory.initElements(driver, HolidaysObjects.class);

	}

	public void selectLeave() {
		seleniumUtills.clickOnElement(holidaysObjects.leave);

	}
	public void selectConfigure() {
		seleniumUtills.clickOnElement(holidaysObjects.configure);

	}

	public void selectHolidays() {
		seleniumUtills.clickOnElement(holidaysObjects.holidays);

	}
	
	public void enterFrom(String from) {
		seleniumUtills.entertext(holidaysObjects.from, from);
		
	}
	
	public void enterTo(String to) {
		seleniumUtills.entertext(holidaysObjects.to, to);
		
	}
	
	public void selectSearch() {
		seleniumUtills.clickOnElement(holidaysObjects.search);
	}

}


