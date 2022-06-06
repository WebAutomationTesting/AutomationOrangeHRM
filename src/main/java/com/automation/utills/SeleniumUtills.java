package com.automation.utills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.BaseClass;

public class SeleniumUtills extends BaseClass {
	
	public void entertext(WebElement locator,String value) {
		locator.sendKeys(value);
		
	}
	
	public void clickOnElement(WebElement locator) {
		locator.click();
	}
	
	public void selectvisubleText(String locator,String value) {
		Select select=new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(value);
		
	}

}