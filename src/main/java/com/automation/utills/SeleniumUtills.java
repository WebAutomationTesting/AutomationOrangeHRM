package com.automation.utills;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.BaseClass;

public class SeleniumUtills extends BaseClass {
	
	public void entertext(WebElement locator,String value) {
		locator.clear();
		locator.sendKeys(value);
		
	}
	
	public void clickOnElement(WebElement locator) {
		locator.click();
	}
	
	public void selectvisubleText(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void selectIndexText(WebElement element,int value) {
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	
	

}