package com.module.utils.admin.configuration;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.module.objects.admin.configuration.SocialMediaAuthenticationObjects;

public class SocialMediaAuthenticationUtils extends BaseClass {
	
	SeleniumCore seleniumCore;
	SeleniumUtills seleniumUtills;
	SocialMediaAuthenticationObjects socialMediaAuthenticationObjects;
	
	public SocialMediaAuthenticationUtils() {
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver,SeleniumUtills.class);
		socialMediaAuthenticationObjects=PageFactory.initElements(driver,SocialMediaAuthenticationObjects.class);
	}
	public void clickadmin() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.Admin);
	}
	public void clickcon() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.configuration);
	}
	public void clickonsocial() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.socialmedia);
	}
	public void clickonadd() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.add);
	}
	public void entertype( String type) {
		seleniumUtills.selectvisubleText(socialMediaAuthenticationObjects.type, type);
	}
	public void entername(String name,String url,String clientid,String secret,String devkey) {
    seleniumUtills.entertext(socialMediaAuthenticationObjects.name, name);	
    seleniumUtills.entertext(socialMediaAuthenticationObjects.url, url);
    seleniumUtills.entertext(socialMediaAuthenticationObjects.client, clientid);
    seleniumUtills.entertext(socialMediaAuthenticationObjects.secret, secret);
    seleniumUtills.entertext(socialMediaAuthenticationObjects.devkey, devkey);
    }
	public void clicksave() {
	seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.save);
	}
	public void clickcheck() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.check);
	}
	public void clickdel() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.delete);
	}
	public void clickok() {
		seleniumUtills.clickOnElement(socialMediaAuthenticationObjects.deleteok);
	}

}
