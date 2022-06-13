package com.module.utils.admin;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.NationalitiesObjects;
import com.module.objects.admin.job.JobCategoriesObjects;

public class NationalitiesUtils extends BaseClass{
	
	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public NationalitiesObjects nationalitiesObjects;
	public JobCategoriesObjects jobCategoriesobjects;

	public NationalitiesUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		nationalitiesObjects=PageFactory.initElements(driver,NationalitiesObjects.class);
		jobCategoriesobjects=PageFactory.initElements(driver,JobCategoriesObjects.class);
	}
	
	public void clickOnNationality() {
		seleniumCore.clickOnSubmenu(jobCategoriesobjects.adminHeader,nationalitiesObjects.nationality);
	}
	
	public void enterName(String name) {
		seleniumUtills.entertext(nationalitiesObjects.addNationalityName,name);
		
	}
	public void clickOnSave() {
		seleniumUtills.clickOnElement(nationalitiesObjects.save);
	}
	
}
