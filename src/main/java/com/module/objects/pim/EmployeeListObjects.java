package com.module.objects.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class EmployeeListObjects extends BaseClass {
	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement employee;
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empname;
	
	@FindBy(id="firstName")
	public WebElement firstname;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastname;
	
	@FindBy(id="employeeId")
	public WebElement empid;
	
	@FindBy(id="photofile")
	public WebElement photo;
	
	@FindBy(id="chkLogin")
	public WebElement check;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(id="re_password")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//a[text()='Employee List']")
	public WebElement employe;
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement search;
	
	@FindBy(id="searchBtn")
	public WebElement searc1;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement check1;
	
	@FindBy(id="btnDelete")
	public WebElement delete;
	
	@FindBy(xpath="(//input[@value='Ok'])[2]")
	public WebElement ok;
	

}
