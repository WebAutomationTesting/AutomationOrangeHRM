package com.module.utils.admin.organization;

import org.openqa.selenium.devtools.v85.debugger.model.Location;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.configuration.LocalizationObjects;
import com.module.objects.admin.organization.LocationsObjects;

public class Locationsutils  extends BaseClass{
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	LocationsObjects locationobjects;
	
	public Locationsutils( ) {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		locationobjects=PageFactory.initElements(driver, LocationsObjects.class);
	}
	public void selectAdmin() {
		seleniumUtills.clickOnElement(locationobjects.Admin);
	}
	public void selectorganization() {
		seleniumUtills.clickOnElement(locationobjects.Organization);
	}
	public void selectlocation() { 
		seleniumUtills.clickOnElement(locationobjects.location);
	}
	public void entername(String name) {
		seleniumUtills.entertext(locationobjects.name, currDir);	
	}
	
	public void entercity(String city) {
		seleniumUtills.entertext(locationobjects.city, currDir);
	}
	public void selectcountry() {
		seleniumUtills.clickOnElement(locationobjects.country);
	}
	public void selectad() {
		seleniumUtills.clickOnElement(locationobjects.ad);
	}
	
	
	

	
	
 
	

 
}

