package com.module.utils.performance.Configure;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.performance.Configure.KPlsObjects;

public class KPlsUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public KPlsObjects kpisobjects;

	public KPlsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		kpisobjects=PageFactory.initElements(driver, KPlsObjects.class);
	}

	public void clickonPerformance() {
		seleniumUtills.clickOnElement(kpisobjects.Performance);
	}
	public void clickonConfigure() {
		seleniumUtills.clickOnElement(kpisobjects.Configure);
	}
	public void clickonKPIs() {
		seleniumUtills.clickOnElement(kpisobjects.KPIs);
	}
	public void clickonQAEngineer() {
		seleniumUtills.clickOnElement(kpisobjects.QAEngineer);
	}
	public void clickonSearch() {
		seleniumUtills.clickOnElement(kpisobjects.Search);
	}
	public void clickonadD() {
		seleniumUtills.clickOnElement(kpisobjects.adD);
	}
	public void clickonSelect() {
		seleniumUtills.clickOnElement(kpisobjects.select);
	}
	public void selectQAE() {
		seleniumUtills.clickOnElement(kpisobjects.QAE);
	}
	public void entertextKeypermance(String Name) {
		seleniumUtills.entertext(kpisobjects.KeyPermance, "");
	}
	public void entertextMiniumRating(String Name) {
		seleniumUtills.entertext(kpisobjects.MinimumRating, "");
	}
	public void entertextMaximumRating(String Name) {
		seleniumUtills.entertext(kpisobjects.MiximumRating, "");
	}
	public void selectMakeDefaultScale() {
		seleniumUtills.clickOnElement(kpisobjects.MakeDefaultScale);
	}
	public void clickonSaVe() {
		seleniumUtills.clickOnElement(kpisobjects.SaVe);
	}


}

