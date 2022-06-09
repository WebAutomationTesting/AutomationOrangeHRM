package com.module.utils.directory;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.directory.Directoryobjects;


public class Directoryutils extends BaseClass {

	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	Directoryobjects directoryObjects;

	public Directoryutils() {
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		directoryObjects=PageFactory.initElements(driver,Directoryobjects.class);
	}

	public void clickDirectory() {
		seleniumUtills.clickOnElement(directoryObjects.directory);
	}
	public void searchname(String name) {
		seleniumUtills.entertext(directoryObjects.name, name);
	}
	public void search() {
		seleniumUtills.clickOnElement(directoryObjects.search);
	}

}
