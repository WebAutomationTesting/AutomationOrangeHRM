package com.module.objects.admin.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayGradesObjects {

	@FindBy(xpath = "//a[text()='Job']")
	public WebElement job;

	@FindBy(xpath = "//a[text()='Pay Grades']")
	public WebElement payGrades;

	@FindBy(xpath = "//input[@value='Add']")
	public WebElement add;

	@FindBy(xpath = "//input[@name='payGrade[name]']")
	public WebElement name;

	@FindBy(xpath = "//input[@value='Save']")
	public WebElement save;

	@FindBy(xpath = "//input[@name='payGradeCurrency[currencyName]']")
	public WebElement currency;

	@FindBy(xpath = "//input[@name='payGradeCurrency[minSalary]']")
	public WebElement minSalary;

	@FindBy(xpath = "//input[@name='payGradeCurrency[maxSalary]']")
	public WebElement maxSalary;

}
