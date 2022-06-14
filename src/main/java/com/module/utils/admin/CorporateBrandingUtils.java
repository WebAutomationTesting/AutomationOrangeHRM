package com.module.utils.admin;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.CorporateBrandingObjects;
import com.module.objects.admin.job.JobCategoriesObjects;

public class CorporateBrandingUtils extends BaseClass{

	public SeleniumUtills seleniumUtills;
	public SeleniumCore seleniumCore;
	public CorporateBrandingObjects corporateBrandingObjects;
	public JobCategoriesObjects jobCategoriesobjects;

	public CorporateBrandingUtils() {
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		corporateBrandingObjects=PageFactory.initElements(driver,CorporateBrandingObjects.class);
		jobCategoriesobjects=PageFactory.initElements(driver,JobCategoriesObjects.class);
	}

	public void clickOnCorporateBranding() {
		seleniumCore.clickOnSubmenu(jobCategoriesobjects.adminHeader,corporateBrandingObjects.corporateBranding);
	}

	public void clickOnPrimary() {
		seleniumUtills.clickOnElement(corporateBrandingObjects.primaryColor);
	}
	public void clickOnChooseColor() {	
		seleniumUtills.clickOnElement(corporateBrandingObjects.chooseColor);
	}
	public void clickOnsecondaryColor() {
		seleniumUtills.clickOnElement(corporateBrandingObjects.secondaryColor);
	}
	public void clickOnChoose() {
		seleniumUtills.clickOnElement(corporateBrandingObjects.color);
	}

	public void clickOnPublish() {
		seleniumUtills.clickOnElement(corporateBrandingObjects.publish);
	}
	

}
