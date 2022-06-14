package com.module.utils.dashboard;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.dashboard.DashboardObjects;

public class Dashboardutils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public DashboardObjects dashboardObjects;

	public Dashboardutils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		dashboardObjects=PageFactory.initElements(driver, DashboardObjects.class);
	}

	public void clickOnDashboard() {
		seleniumUtills.clickOnElement(dashboardObjects.dashboard);
	}
}
