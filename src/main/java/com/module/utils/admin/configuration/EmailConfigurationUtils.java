package com.module.utils.admin.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.configuration.EmailConfigurationObjects;

public class EmailConfigurationUtils extends BaseClass {
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	EmailConfigurationObjects emailConfigurationObjects;

	public EmailConfigurationUtils() {
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		emailConfigurationObjects=PageFactory.initElements(driver, EmailConfigurationObjects.class);

	}
	public void selectAdmin() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.Admin);
	}
	public void selectconfiguration( ) {
		seleniumUtills.clickOnElement(emailConfigurationObjects.Configuration);
	}
	public void selectemailconfiguration() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.emailconfirguration);
	}
	public void selectedit() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.edit);

	}
	public void entermailsentas(String sendmailas) {
		seleniumUtills.entertext(emailConfigurationObjects.MailSentAs, sendmailas);

	}
	public void selectcheckbox() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.checkbox);
	}
	public void selectsendingmethod() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.sendingmethod);
	}
	
	public void selectsendmail() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.sendmail);
	}
	public void selecttestemailaddress() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.testmail);
	}
	public void selectsave() {
		seleniumUtills.clickOnElement(emailConfigurationObjects.save);
	}
}


