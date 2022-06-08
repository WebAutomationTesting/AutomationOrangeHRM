package com.module.objects.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeeobjects {
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pimHeader;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployeeLink;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="photofile")
	public WebElement photo;
	
	@FindBy(id="employeeId")
	public WebElement empID;
	
	@FindBy(id="btnSave")
	public WebElement saveButton;
	
	@FindBy(id="chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(id="re_password")
	public WebElement confirmPassword;
	

}
