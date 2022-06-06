package com.automation.utills;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.BaseClass;

public class SeleniumCore extends BaseClass {
	
	Actions actions;
	
	
	public void clickOnSubmenu(String menulocator,String sublocator) {
		actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(menulocator))).click(driver.findElement(By.xpath(sublocator))).build().perform();
	}
	
	public void clickOnEnterkeyBord() {
		actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	

}
