package com.module.objects.buzz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuzzObjects {

	@FindBy(id = "menu_buzz_viewBuzz")
	public WebElement buzz;

	@FindBy(id = "status-tab-label")
	public WebElement upDateStatus;

	@FindBy(id = "createPost_content")
	public WebElement status;

	@FindBy(id = "postSubmitBtn")
	public WebElement post;

}
