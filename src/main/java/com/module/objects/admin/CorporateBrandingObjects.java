package com.module.objects.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateBrandingObjects {

	@FindBy(id="menu_admin_addTheme")
	public WebElement corporateBranding;

	@FindBy(xpath = "(//div[@class='sp-dd'])[1]")
	public WebElement primaryColor;

	@FindBy(xpath = "(//div[@class='sp-color'])[1]")
	public WebElement chooseColor;

	@FindBy(xpath = "(//button[text()='choose'])[1]")
	public WebElement color;

	@FindBy(xpath = "(//div[@class='sp-dd'])[2]")
	public WebElement secondaryColor;

	@FindBy(xpath = "(//div[@class='sp-hue'])[1]")
	public WebElement secondChoose;

	@FindBy(id="btnSave")
	public WebElement publish;

}
