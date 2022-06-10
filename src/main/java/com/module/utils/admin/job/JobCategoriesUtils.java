package com.module.utils.admin.job;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.admin.job.JobCategoriesObjects;

public class JobCategoriesUtils extends BaseClass{
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public WaitUtils waitUtils;
	public JobCategoriesObjects jobCategoriesobjects;

	public JobCategoriesUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		jobCategoriesobjects=PageFactory.initElements(driver,JobCategoriesObjects.class);
	}
	
	public void clickOnCategories() {
		seleniumCore.clickOnSubSubmenu(jobCategoriesobjects.adminHeader, jobCategoriesobjects.jobLink, jobCategoriesobjects.jobCategory);
	}
	
	public void addCategoriesDetails(String categoryName) {
		seleniumUtills.entertext(jobCategoriesobjects.categoryName,categoryName);	
	}
	
	public void clickOnLogOut() {
		seleniumUtills.clickOnElement(jobCategoriesobjects.logout);
	}
	public void clickOnWelcome() {
		seleniumUtills.clickOnElement(jobCategoriesobjects.welcomeButton);
	}	
}
