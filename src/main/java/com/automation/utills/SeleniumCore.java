package com.automation.utills;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.BaseClass;

public class SeleniumCore extends BaseClass {
	
	Actions actions;
	
	public void clickOnSubmenu(WebElement menuLocator,WebElement subMenuLocator) {
		actions=new Actions(driver);
		actions.moveToElement(menuLocator).
		click(subMenuLocator).build().perform();
	}
	
	public void clickOnSubSubmenu(WebElement menuLocator,WebElement subMenuLocator,WebElement subSubMenuLocator) {
		actions=new Actions(driver);
		actions.moveToElement(menuLocator).build().perform();
		actions.moveToElement(subMenuLocator).build().perform();
		actions.click(subSubMenuLocator).build().perform();
	}
	
	public void clickOnEnterkeyBord() {
		actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	

}
