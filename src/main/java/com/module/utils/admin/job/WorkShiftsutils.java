package com.module.utils.admin.job;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.admin.job.JobCategoriesObjects;
import com.module.objects.admin.job.WorkShiftsObjects;

public class WorkShiftsutils extends BaseClass {
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public WaitUtils waitUtils;
	public WorkShiftsObjects workShiftsObjects;
	public JobCategoriesObjects jobCategoriesObjects;

	public WorkShiftsutils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		workShiftsObjects=PageFactory.initElements(driver,WorkShiftsObjects.class);
		jobCategoriesObjects=PageFactory.initElements(driver,JobCategoriesObjects.class);
	}

	public void clickOnWorkShift() {
		seleniumCore.clickOnSubSubmenu(jobCategoriesObjects.adminHeader,jobCategoriesObjects.jobLink, workShiftsObjects.workShiftsTab);
	}
	
	public void AddWorkShiftDetails(String workShiftName) {
		seleniumUtills.entertext(workShiftsObjects.workShiftName, workShiftName);	
	}
	public void selectFrom(String from) {
		seleniumUtills.selectvisubleText(workShiftsObjects.workFrom,from);
		waitUtils.waitTime(2000);
		seleniumUtills.clickOnElement(workShiftsObjects.workOnTime);
	}
		public void selectTo(String to) {
		seleniumUtills.selectvisubleText(workShiftsObjects.workTo,to);
		waitUtils.waitTime(2000);
		seleniumUtills.clickOnElement(workShiftsObjects.workOffTime);
	}

}
