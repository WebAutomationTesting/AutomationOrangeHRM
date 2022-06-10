package com.module.objects.performance.managereviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyReviewsObjects {

	@FindBy(id = "menu__Performance")
	public WebElement performance;

	@FindBy(id = "menu_performance_ManageReviews")
	public WebElement manageReviews;

	@FindBy(xpath = "//a[text()='My Reviews']")
	public WebElement myReviews;


}
