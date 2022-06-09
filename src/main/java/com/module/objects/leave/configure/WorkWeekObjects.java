package com.module.objects.leave.configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkWeekObjects {

	@FindBy(xpath = "//b[text()='Leave']")
	public WebElement leave;

	@FindBy(xpath = "(//a[text()='Configure'])[1]")
	public WebElement configure;

	@FindBy(xpath ="//a[text()='Work Week']" )
	public WebElement workweek;

	@FindBy(xpath = "//input[@value='Edit']")
	public WebElement edit;

	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Monday]']")
	public WebElement monday;

	@FindBy(xpath = "(//option[text()='Full Day'])[1]")
	public WebElement mondayFullday;

	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Tuesday]']")
	public WebElement tuesday;

	@FindBy(xpath = "(//option[text()='Full Day'])[2]")
	public WebElement tuesdayFullday;
	
	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Wednesday]']")
	public WebElement wednesday;

	@FindBy(xpath = "(//option[text()='Full Day'])[3]")
	public WebElement wednesdayFullday;

	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Thursday]']")
	public WebElement thursday;

	@FindBy(xpath = "(//option[text()='Full Day'])[4]")
	public WebElement thursdayFullday;

	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Friday]']")
	public WebElement friday;

	@FindBy(xpath = "(//option[text()='Full Day'])[5]")
	public WebElement fridayFullday;

	@FindBy(xpath = "//select[@name='WorkWeek[day_length_Saturday]']")
	public WebElement saturday;
	
	@FindBy(xpath = "(//option[text()='Non-working Day'])[6]")
	public WebElement saturdayNonWorkingDay;

    @FindBy(xpath = "//select[@name='WorkWeek[day_length_Sunday]']")
    public WebElement sunday;
    
	@FindBy(xpath = "(//option[text()='Non-working Day'])[7]")
	public WebElement sundayNonWorkingDay;
	
	@FindBy(xpath = "//input[@id='saveBtn']")
	public WebElement save;
	
	
}
