package com.module.objects.performance.Configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KPlsObjects {

	@FindBy(xpath = "//a[@id='menu__Performance']")
	public WebElement Performance;

	@FindBy(xpath = "//a[@id='menu_performance_Configure']")
	public WebElement Configure;

	@FindBy(xpath = "//a[text()='KPIs']")
	public WebElement KPIs;

	@FindBy(xpath = "//select[@class='formSelect']")
	public WebElement All;

	@FindBy(xpath ="//option[@value='9']")
	public WebElement QAEngineer;

	@FindBy(xpath = "//input[@name='searchBtn']")
	public WebElement Search;

	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement adD;

	@FindBy(xpath = "//select[@class='formSelect']")
	public WebElement select;

	@FindBy(xpath = "//option[@value='9']")
	public WebElement QAE;

	@FindBy(xpath = "(//input[@class='formInputText'])[1]")
	public WebElement KeyPermance;

	@FindBy(xpath = "(//input[@class='formInputText'])[2]")
	public WebElement MinimumRating;

	@FindBy(xpath = "(//input[@class='formInputText'])[3]")
	public WebElement MiximumRating;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement MakeDefaultScale;

	@FindBy(xpath = "//input[@id='saveBtn']")
	public WebElement SaVe;

}
