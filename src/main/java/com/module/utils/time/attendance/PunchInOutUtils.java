package com.module.utils.time.attendance;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.automation.utills.WaitUtils;
import com.module.objects.time.attendance.PunchInOutObjects;

public class PunchInOutUtils extends BaseClass {
	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public WaitUtils waitUtils;
	PunchInOutObjects punchInOutObjects;

	public PunchInOutUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills=PageFactory.initElements(driver, SeleniumUtills.class);
		waitUtils=PageFactory.initElements(driver, WaitUtils.class);
		punchInOutObjects=PageFactory.initElements(driver, PunchInOutObjects.class);
	}

	public void clickOnPunchInOut() {
		seleniumCore.clickOnSubSubmenu(punchInOutObjects.time, punchInOutObjects. attendence, punchInOutObjects.punchin);
	}

	public void punIn(String note) {
		seleniumUtills.entertext(punchInOutObjects.PunchInOut,note);
		seleniumUtills.clickOnElement(punchInOutObjects.in);

	}

	public void punchout(String note)  {
		seleniumUtills.entertext(punchInOutObjects.PunchInOut,note);
		seleniumUtills.clickOnElement(punchInOutObjects.out);
	}
}